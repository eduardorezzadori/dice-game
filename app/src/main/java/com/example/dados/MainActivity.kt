package com.example.dados

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var previousResult = 0
    private var randomValue = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.play_button)
        val image = findViewById<ImageView>(R.id.dice_image)
        val diceResult = findViewById<TextView>(R.id.dice_result)

        var imageId: Int

        diceResult.text = getString(R.string.dice_result, randomValue)

        button.setOnClickListener {
            randomValue = (1..6).random()

            imageId = selectImage(randomValue)

            image.setImageResource(imageId)

            diceResult.text = getString(R.string.dice_result, randomValue)

            if (previousResult == randomValue) {
                Toast.makeText(this, getString(R.string.toast_info), Toast.LENGTH_SHORT).show()

                val intent = Intent(this, RepeatedNumberActivity::class.java)
                intent.putExtra("number", randomValue)
                intent.putExtra("image", imageId)
                startActivity(intent)
            }

            previousResult = randomValue
        }
    }

    fun selectImage(number: Int): Int {
        when (number) {
            1 -> return(R.drawable.dice1)
            2 -> return(R.drawable.dice2)
            3 -> return(R.drawable.dice3)
            4 -> return(R.drawable.dice4)
            5 -> return(R.drawable.dice5)
            6 -> return(R.drawable.dice6)
        }
        return -1
    }
}

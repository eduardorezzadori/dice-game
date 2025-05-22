package com.example.dados

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
        val button = findViewById<Button>(R.id.playButton)
        val image = findViewById<ImageView>(R.id.diceImage)
        val diceResult = findViewById<TextView>(R.id.diceResult)

        diceResult.text = getString(R.string.dice_result, randomValue)

        button.setOnClickListener {
            randomValue = (1..6).random()

            when (randomValue) {
                1 -> image.setImageResource(R.drawable.dice1)
                2 -> image.setImageResource(R.drawable.dice2)
                3 -> image.setImageResource(R.drawable.dice3)
                4 -> image.setImageResource(R.drawable.dice4)
                5 -> image.setImageResource(R.drawable.dice5)
                6 -> image.setImageResource(R.drawable.dice6)
            }
            diceResult.text = getString(R.string.dice_result, randomValue)

            if (previousResult == randomValue) {
                Toast.makeText(this, getString(R.string.toast_info), Toast.LENGTH_SHORT).show()
            }

            previousResult = randomValue
        }
    }
}

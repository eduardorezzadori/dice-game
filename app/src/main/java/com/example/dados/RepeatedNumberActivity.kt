package com.example.dados

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RepeatedNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_repeated_number)

        val numberRepeatedString = findViewById<TextView>(R.id.dice_repeated_result)

        val number = intent.getIntExtra("number", -1)
        val imageId = intent.getIntExtra("image", R.drawable.dice1)

        numberRepeatedString.text = getString(R.string.repeated_result, number)

        val image = findViewById<ImageView>(R.id.dice_image)
        image.setImageResource(imageId)
    }
}

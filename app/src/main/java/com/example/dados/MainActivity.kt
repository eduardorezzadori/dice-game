package com.example.dados

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.butao)
        val ibagem = findViewById<ImageView>(R.id.imagem)

        button.setOnClickListener {
            val value = (1..6).random()

            when (value) {
                1 -> ibagem.setImageResource(R.drawable.dice1)
                2 -> ibagem.setImageResource(R.drawable.dice2)
                3 -> ibagem.setImageResource(R.drawable.dice3)
                4 -> ibagem.setImageResource(R.drawable.dice4)
                5 -> ibagem.setImageResource(R.drawable.dice5)
                6 -> ibagem.setImageResource(R.drawable.dice6)
            }
        }
    }
}

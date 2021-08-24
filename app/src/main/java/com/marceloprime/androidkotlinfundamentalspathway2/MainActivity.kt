package com.marceloprime.androidkotlinfundamentalspathway2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var sum = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice()}
        val countUp : Button = findViewById(R.id.countUp)
        countUp.setOnClickListener{count()}
    }
    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.roll_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
        Toast.makeText(this,"button Clicked",Toast.LENGTH_SHORT).show()
    }

    private fun count(){
        val resultText: TextView = findViewById(R.id.roll_text)
        var number = resultText.text
        sum = number.toString().toInt() + sum
        Toast.makeText(this,sum.toString(),Toast.LENGTH_SHORT).show()
    }
}


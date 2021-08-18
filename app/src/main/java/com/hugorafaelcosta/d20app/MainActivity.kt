package com.hugorafaelcosta.d20app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val dice = Dice(20)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.result)
        diceImage.setImageResource(R.drawable.d2)
    }
}


private class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
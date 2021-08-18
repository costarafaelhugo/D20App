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

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            6 -> R.drawable.d6
            7 -> R.drawable.d7
            8 -> R.drawable.d8
            9 -> R.drawable.d9
            10 -> R.drawable.d10
            11 -> R.drawable.d11
            12 -> R.drawable.d12
            13 -> R.drawable.d13
            14 -> R.drawable.d14
            15 -> R.drawable.d15
            16 -> R.drawable.d16
            17 -> R.drawable.d17
            18 -> R.drawable.d18
            19 -> R.drawable.d19
            else -> R.drawable.d20
        }

        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = diceRoll.toString()

    }
}


private class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
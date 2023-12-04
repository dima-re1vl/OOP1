package com.example.oop1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        findViewById<ImageView>(R.id.back_img).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.calculate_btn).setOnClickListener {
            val number = findViewById<EditText>(R.id.number_1).text.toString().toDoubleOrNull()

            if (number != null) {
                val squareArea = number * number
                findViewById<TextView>(R.id.result_text).text = "$squareArea"
            } else {
                findViewById<TextView>(R.id.result_text).text = "Не число :("
            }
        }
    }
}
package com.example.oop1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class RectangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        findViewById<ImageView>(R.id.back_img).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.rectangle_btn).setOnClickListener {
            val number1 = findViewById<EditText>(R.id.rectangle_number_1).text.toString().toDoubleOrNull()
            val number2 = findViewById<EditText>(R.id.rectangle_number_2).text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val rectangle_area = number1 * number2
                findViewById<TextView>(R.id.result_text).text = "S = $rectangle_area"
            } else {
                findViewById<TextView>(R.id.result_text).text = "Не число :("
            }
        }
    }
}
package com.example.oop1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class CircleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        findViewById<ImageView>(R.id.back_img).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.circle_btn).setOnClickListener {
            val number = findViewById<EditText>(R.id.circle_number_1).text.toString().toDoubleOrNull()

            if (number != null) {
                val df = DecimalFormat("#.#####")
                val circleArea = number * Math.pow(Math.PI, 2.0)
                findViewById<TextView>(R.id.result_text).text = "S = ${df.format(circleArea)}"
            } else {
                findViewById<TextView>(R.id.result_text).text = "Не число :("
            }
        }
    }
}
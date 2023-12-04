package com.example.oop1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.circle_img).setOnClickListener {
            val intent = Intent(this, CircleActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.rectangle_img).setOnClickListener {
            val intent = Intent(this, RectangleActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.square_img).setOnClickListener {
            val intent = Intent(this, SquareActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            openSecondActivity("author")
        }

        button2.setOnClickListener {
            openSecondActivity("faculty")
        }

        button3.setOnClickListener {
            openSecondActivity("city")
        }
    }
    private fun openSecondActivity(infoType: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("infoType", infoType)
        startActivity(intent)
    }
}
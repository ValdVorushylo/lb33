package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val infoType = intent.getStringExtra("infoType")
        val infoTextView = findViewById<TextView>(R.id.infoTextView)

        when (infoType) {
            "author" -> infoTextView.text = "Автор: Ворушило Владислав"
            "faculty" -> infoTextView.text = "Факультет інформаційних технологій"
            "city" -> infoTextView.text = "Місто: Київ"
        }
    }
}
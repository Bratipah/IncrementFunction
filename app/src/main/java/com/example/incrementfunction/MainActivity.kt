package com.example.incrementfunction

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val incrementClick = findViewById<Button>(R.id.button_increment)


        incrementClick.setOnClickListener {
            countNum()
        }
    }

    private fun countNum() {
        var count = 0
        count++
        val resultText = findViewById<TextView>(R.id.increment_textView)
        resultText.text = count.toString()
    }


}


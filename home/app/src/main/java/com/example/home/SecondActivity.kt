package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var getNameSurName: TextView
    lateinit var backToMain: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getNameSurName = findViewById(R.id.getNameSurName)
        backToMain = findViewById(R.id.sendButton)

        val getNameVal = intent.getStringExtra("NAME")
        val getSurNameVal = intent.getStringExtra("SURNAME")

        getNameSurName.text = "$getNameVal $getSurNameVal"


        backToMain.setOnClickListener {
            onBackPressed()
        }
    }
}
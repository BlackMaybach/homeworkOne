package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var getName: TextView
    lateinit var getSurName: TextView
    lateinit var backToMain: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getName = findViewById(R.id.getName)
        getSurName = findViewById(R.id.getSurName)
        backToMain = findViewById(R.id.sendButton)

        val getNameVal = intent.getStringExtra("NAME")
        val getSurNameVal = intent.getStringExtra("SURNAME")

        getName.text = getNameVal
        getSurName.text = getSurNameVal


        backToMain.setOnClickListener {
            onBackPressed()
        }
    }
}
package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name: TextView
    lateinit var surname: TextView
    lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        name = findViewById(R.id.name)
        surname = findViewById(R.id.surname)

        sendButton = findViewById(R.id.sendButton)

        sendButton.setOnClickListener {

            val name1 = name.text.toString()
            val surname1 = surname.text.toString()

            val intent = Intent(this, SecondActivity::class.java)


            if (name1.isEmpty()) {
                Toast.makeText(this, "Введите имя!", Toast.LENGTH_LONG).show()
            }
            else if (surname1.isEmpty()) {
                Toast.makeText(this, "Введите фамилию!", Toast.LENGTH_LONG).show()
            }
            else
            {
                intent.putExtra("NAME", name1)
                intent.putExtra("SURNAME", surname1)
                startActivity(intent)
            }

        }


    }
}
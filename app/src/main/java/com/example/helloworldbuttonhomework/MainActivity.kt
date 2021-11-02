package com.example.helloworldbuttonhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldText : TextView = findViewById(R.id.hello_world_text)
        val helloWorldButton : Button = findViewById(R.id.hello_world_button)

        helloWorldButton.setOnClickListener {
            helloWorldText.text = getString(R.string.text_on_click)
        }
    }
}
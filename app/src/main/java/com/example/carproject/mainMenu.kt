package com.example.carproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

    class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carOneButton = findViewById<Button>(R.id.carOneButton)
        val carTwoButton = findViewById<Button>(R.id.carTwoButton)

        carOneButton.setOnClickListener{
            val intent = Intent(this@MainMenu,Car1::class.java)
            startActivity(intent)
        }

        carTwoButton.setOnClickListener{
            val intent = Intent(this@MainMenu,Car2::class.java)
            startActivity(intent)
        }
    }
}

package com.example.carproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

    class Car2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car2)

        val carOneButton = findViewById<Button>(R.id.carOneButton)
        val mainMenuButton = findViewById<Button>(R.id.mainMenuButton)

        carOneButton.setOnClickListener{
            val intent = Intent(this@Car2,Car1::class.java)
            startActivity(intent)
        }

        mainMenuButton.setOnClickListener{
            val intent = Intent(this@Car2,MainMenu::class.java)
            startActivity(intent)
        }
    }
}
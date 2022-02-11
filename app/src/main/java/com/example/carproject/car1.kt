package com.example.carproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

    class Car1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car1)

        val carTwoButton = findViewById<Button>(R.id.carOneButton)
        val mainMenuButton = findViewById<Button>(R.id.mainMenuButton)

        carTwoButton.setOnClickListener{
            val intent = Intent(this@Car1,Car2::class.java)
            startActivity(intent)
        }

        mainMenuButton.setOnClickListener{
            val intent = Intent(this@Car1,MainMenu::class.java)
            startActivity(intent)
        }
    }
}
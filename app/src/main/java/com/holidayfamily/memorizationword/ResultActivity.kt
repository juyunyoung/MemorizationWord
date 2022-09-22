package com.holidayfamily.memorizationword

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saveButton = findViewById<Button>(R.id.saveBtn)
        val homeButton  = findViewById<button>(R.id.homeBtn)
        val shuffleButton = findViewById<Button>(R.id.shuffleBtn)

        saveButton.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
        }
        homeButton.setOnClickListener{
            //pageMove
        }
        shuffleButton.setOnClickListener{
            //pageMove
        }
    }
}
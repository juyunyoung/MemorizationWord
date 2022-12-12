package com.holidayfamily.memorizationword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val save_btn =  findViewById(R.id.add_save_button)
        save_btn.setOnClickListener{
            saveWore();
        }

        fun saveWord(){
            val input_text =  findViewById(R.id.word_input_View)
            var word_text = input_text.text;
        }
    }
}
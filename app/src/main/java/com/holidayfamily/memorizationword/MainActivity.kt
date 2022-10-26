package com.holidayfamily.memorizationword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.holidayfamily.memorizationword.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
//https://mimisongsong.tistory.com/m/33
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setFragment(TAG_HOME, MainActivity())

        binding.navigationView.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.nainFragment -> startActivity(Intent(this, MainActivity::class.java))
                R.id.recodeFragment -> startActivity(Intent(this, RecodeActivity::class.java))
                R.id.myPageFragment-> startActivity(Intent(this, MypageActivity::class.java))
                R.id.addFragment-> startActivity(Intent(this, AddActivity::class.java))
            }
            true
        }
    }

}

package com.example.myfashionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfashionapp.databinding.ActivityClassicshoeBinding

class Classicshoe : AppCompatActivity() {
    lateinit var binding: ActivityClassicshoeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classicshoe)
        binding=ActivityClassicshoeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnCart1.setOnClickListener {
            val intent=Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}






package com.example.myfashionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfashionapp.databinding.ActivityCartBinding
import com.example.myfashionapp.databinding.ActivityClassicshoeBinding

class Cart : AppCompatActivity() {
    lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        binding=ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnCheck.setOnClickListener {
            val intent=Intent(this,Payments::class.java)
            startActivity(intent)


        }
    }
}

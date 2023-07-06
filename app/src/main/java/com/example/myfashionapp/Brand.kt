package com.example.myfashionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfashionapp.databinding.ActivityBrandBinding

class Brand : AppCompatActivity() {
    lateinit var binding: ActivityBrandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand)
        binding= ActivityBrandBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnBrand.setOnClickListener {
            val intent=Intent(this,Category::class.java)
            startActivity(intent)
        }
    }
}




package com.example.myfashionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfashionapp.databinding.ActivityClassicshoeBinding
import com.example.myfashionapp.databinding.ActivityFavouriteBinding

class Favourite : AppCompatActivity() {
    lateinit var binding: ActivityFavouriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)
        binding= ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnFav.setOnClickListener {
            val intent=Intent(this,Category::class.java)
            startActivity(intent)
        }

    }
}



package com.example.myfashionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfashionapp.databinding.ActivityCategoryBinding
import com.example.myfashionapp.databinding.ActivityClassicshoeBinding

class Category : AppCompatActivity() {
    lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        binding= ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnCat.setOnClickListener {
            val intent=Intent(this,Classicshoe::class.java)
            startActivity(intent)
        }
    }
}






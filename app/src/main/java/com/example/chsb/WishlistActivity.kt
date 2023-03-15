package com.example.chsb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chsb.databinding.ActivityWishlistBinding

class WishlistActivity: AppCompatActivity() {
    lateinit var binding: ActivityWishlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWishlistBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}
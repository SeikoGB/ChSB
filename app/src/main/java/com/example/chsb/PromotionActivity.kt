package com.example.chsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chsb.adapter.PromotionAdapter
import com.example.chsb.databinding.ActivityPromotionBinding

class PromotionActivity : AppCompatActivity() {
    lateinit var binding : ActivityPromotionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPromotionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var adapter = PromotionAdapter()




    }
}
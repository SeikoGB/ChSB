package com.example.chsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chsb.adapter.PromotionAdapter
import com.example.chsb.databinding.ActivityPromotionBinding
import com.example.chsb.model.Promotion

class PromotionActivity : AppCompatActivity() {
    lateinit var binding : ActivityPromotionBinding

    lateinit var promotionList : MutableList<Promotion>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPromotionBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var adapter = PromotionAdapter(promotionList)

        var manager = GridLayoutManager(this, 1,)

        binding.promotionrecycler.adapter = adapter
        binding.promotionrecycler.layoutManager = manager




    }
}
package com.example.chsb.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chsb.databinding.PromotionItemBinding
import com.example.chsb.model.Promotion

class PromotionAdapter(var promotionList: MutableList<Promotion>): RecyclerView.Adapter<PromotionAdapter.PromotionHolder>() {

    class PromotionHolder(binding: PromotionItemBinding): RecyclerView.ViewHolder(binding.root){
        var name = binding.promotionItemName
        var img = binding.promotionItemImg

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromotionHolder {

        return PromotionHolder(PromotionItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return promotionList.size
    }

    override fun onBindViewHolder(holder: PromotionHolder, position: Int) {
        holder.name.text = promotionList[position].name
        holder.img.setImageResource(promotionList[position].img)


    }
}
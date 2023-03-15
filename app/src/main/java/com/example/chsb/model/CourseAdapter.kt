package com.example.chsb.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chsb.Course
import com.example.chsb.R
import com.example.chsb.databinding.CoursesItemBinding

class CourseAdapter (var list:List<Course>): RecyclerView.Adapter<CourseAdapter.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var name= itemView.findViewById<TextView>(R.id.name)
        var lessons_amount=itemView.findViewById<TextView>(R.id.lesson_amount)
        var price=itemView.findViewById<TextView>(R.id.price)
        var reyting=itemView.findViewById<TextView>(R.id.reyting)
        var isFavourite=itemView.findViewById<ImageView>(R.id.favourite)
        var photo=itemView.findViewById<ImageView>(R.id.photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.courses_item, parent, false)

        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return  list.size
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var cort = list.get(position)

        holder.photo.setImageResource(cort.photo)

        holder.name.text = cort.name
    }
}
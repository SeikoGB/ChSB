package com.example.chsb

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chsb.databinding.ActivityMenuBinding
import com.example.chsb.model.CourseAdapter

class MenuActivity : AppCompatActivity() {

    var popular_list= arrayListOf<Course>()
    var all_couses= arrayListOf<Course>()
    var promotion_list= arrayListOf<>()
    var newest= arrayListOf<Course>()
    var binder= ActivityMenuBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binder.root)



        var popular = CourseAdapter(popular_list)
        var popularman = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binder.promotionsRv.adapter = popular
        binder.promotionsRv.layoutManager = popularman


        binder.favourite.setOnClickListener{
            startActivity(Intent(this,RegistrationActivity::class.java))
        }

    }
}
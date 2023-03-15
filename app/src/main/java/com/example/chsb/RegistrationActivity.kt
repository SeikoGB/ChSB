package com.example.chsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chsb.databinding.ActivityRegistrationBinding
import com.example.chsb.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlin.math.log

class RegistrationActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistrationBinding
    lateinit var users_data : MutableList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)
        var edit = sharedPreferences.edit()
        var datas = sharedPreferences.getString("users","")

        binding.loginButton.setOnClickListener {
            if (datas == ""){
                users_data = mutableListOf()
                Toast.makeText(this, "you have not saved changes", Toast.LENGTH_SHORT).show()
            }
            else{
                users_data = gson.fromJson(datas,type)
            }
        }







    }
}
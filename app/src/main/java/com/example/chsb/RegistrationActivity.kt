package com.example.chsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chsb.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)
        var edit = sharedPreferences.edit()
        var datas = sharedPreferences.getString("users","")






    }
}
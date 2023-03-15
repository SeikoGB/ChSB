package com.example.chsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chsb.databinding.ActivitySignUpBinding
import com.example.chsb.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class SignUpActivity : AppCompatActivity() {
    lateinit var users : MutableList<User>
    lateinit var users_data : MutableList<User>
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        users = mutableListOf<User>()
        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)
        var edit = sharedPreferences.edit()
        var datas = sharedPreferences.getString("users","")


        binding.saveChanges.setOnClickListener {
            if (binding.loginOrg.text != null && binding.emailOrg.text != null && binding.passwordOrg.text != null){
                var usern = binding.loginOrg.text.toString()
                var userp = binding.passwordOrg.text.toString()
                var str = sharedPreferences.getString("users","")
                if (str ==""){
                    users = mutableListOf<User>()
                }
                else{
                    users = gson.fromJson(str, type)
                }

                users.add(User(usern,userp))
                val s = gson.toJson(users)
                edit.putString("users",s).commit()
            }
            else Toast.makeText(this, "please fill the blanks", Toast.LENGTH_SHORT).show()
        }

        binding.createAccount.setOnClickListener {

            if (datas == ""){
                users_data = mutableListOf()
                Toast.makeText(this, "you have not saved changes", Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(Intent(this,RegistrationActivity::class.java))
            }
        }








    }
}
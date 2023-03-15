package com.example.chsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chsb.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    lateinit var users : MutableList<User>
    lateinit var users_data : MutableList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        users = mutableListOf<User>()
        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)
        var edit = sharedPreferences.edit()
        var datas = sharedPreferences.getString("users","")


        save_changes.setOnClickListener {
            if (login_org.text != null && email_org.text != null && password_org.text != null){
                var usern = login_org.text.toString()
                var userp = password_org.text.toString()
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

        create_account.setOnClickListener {

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
package com.example.chsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

<<<<<<< HEAD

=======
        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
>>>>>>> origin/master
        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)


    }
}
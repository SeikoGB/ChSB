package com.example.chsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chsb.model.User
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var sharedPreferences = getSharedPreferences("user", MODE_PRIVATE)


    }
}
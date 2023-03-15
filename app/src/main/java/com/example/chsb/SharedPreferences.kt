package com.example.chsb

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencest(var shared: SharedPreferences) {

    companion object {

        fun getInstance(context: Context): com.example.chsb.SharedPreferencest {
            return SharedPreferencest(
                context.getSharedPreferences(
                    "FILE",
                    Context.MODE_PRIVATE
                )
            )
        }
    }

}
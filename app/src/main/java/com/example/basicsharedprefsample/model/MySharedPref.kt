package com.example.basicsharedprefsample.model

import android.content.Context

/**
 * Created by Taha Ben Ashur (https://github.com/tahaak67) on 04,Feb,2023
 */
class MySharedPref(context: Context) {

    companion object {
        private const val FILE_KEY = "user_info"
        private const val USER_NAME = "user_name"
    }

    private val sharedPref = context.getSharedPreferences(FILE_KEY, Context.MODE_PRIVATE)

    fun saveUsername(name: String){
        sharedPref.edit()
            .putString(USER_NAME, name)
            .apply()
    }

    fun getUsername(): String? {
        return sharedPref.getString(USER_NAME, null)
    }
}
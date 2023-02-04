package com.example.basicsharedprefsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicsharedprefsample.databinding.ActivityMainBinding
import com.example.basicsharedprefsample.model.MySharedPref

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pref = MySharedPref(this)

        binding.apply {
            btnRead.setOnClickListener {
                etName.setText(pref.getUsername())
            }
            btnSave.setOnClickListener {
                pref.saveUsername(etName.text.toString())
            }
        }
    }
}
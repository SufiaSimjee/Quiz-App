package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.ui.Question

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnStart.setOnClickListener {

            var userName = binding.etName.text.toString()

            if(!TextUtils.isEmpty(userName)) {
                Intent(this@MainActivity , Question::class.java).also {
                    startActivity(it)
                    finish() // close the current activity
                }
            } else {
                binding.etName.error = "Please enter a name"
                binding.etName.requestFocus()
            }
        }

        setContentView(binding.root)
    }
}
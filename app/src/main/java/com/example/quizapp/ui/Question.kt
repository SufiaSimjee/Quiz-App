package com.example.quizapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityQuestionBinding
import com.example.quizapp.utils.Constants

class Question : AppCompatActivity() {

    private lateinit var binding : ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionBinding.inflate(layoutInflater)

        val questionsList = Constants.getQuestions()
        Log.d("Questions List" , "${questionsList.size}")

        setContentView(binding.root)
    }
}
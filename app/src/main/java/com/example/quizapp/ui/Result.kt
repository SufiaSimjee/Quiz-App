package com.example.quizapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityResultBinding
import com.example.quizapp.utils.Constants

class Result : AppCompatActivity() {

    private lateinit var binding : ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)

        binding.textViewUsername.text = intent.getStringExtra(Constants.USER_NAME)

        val score = intent.getIntExtra(Constants.SCORE, 0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        binding.textViewScore.text = "You scored $score out of $totalQuestions"

        binding.buttonFinish.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)

    }
}
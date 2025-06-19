package com.example.quizapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityQuestionBinding
import com.example.quizapp.model.Question
import com.example.quizapp.utils.Constants

class Question : AppCompatActivity() {

    private lateinit var binding : ActivityQuestionBinding

    private val currentPosition = 1
    private lateinit var questionsList: MutableList<Question>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionBinding.inflate(layoutInflater)

        questionsList = Constants.getQuestions()
        Log.d("Questions List" , "${questionsList.size}")

        setQuestion()

        setContentView(binding.root)
    }

    private fun setQuestion() {
        val question = questionsList[currentPosition - 1]
        binding.imageFlag.setImageResource(question.image)
        binding.progressBar.progress = currentPosition
        binding.textViewProgress.text = "$currentPosition/${binding.progressBar.max}"
        binding.questionTextView.text = question.question
        binding.textViewOptionOne.text = question.optionOne
        binding.textViewOptionTwo.text = question.optionTwo
        binding.textViewOptionThree.text = question.optionThree
        binding.textViewOptionFour.text = question.optionFour
    }

}
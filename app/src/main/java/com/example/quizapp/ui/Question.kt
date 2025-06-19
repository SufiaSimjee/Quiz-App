package com.example.quizapp.ui

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityQuestionBinding
import com.example.quizapp.model.Question
import com.example.quizapp.utils.Constants

class Question : AppCompatActivity() , View.OnClickListener {

    private lateinit var binding : ActivityQuestionBinding

    private val currentPosition = 1
    private lateinit var questionsList: MutableList<Question>

    private var selectedOptionPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionBinding.inflate(layoutInflater)

        questionsList = Constants.getQuestions()
        Log.d("Questions List" , "${questionsList.size}")

        setQuestion()

        binding.textViewOptionOne.setOnClickListener(this)
        binding.textViewOptionTwo.setOnClickListener(this)
        binding.textViewOptionThree.setOnClickListener(this)
        binding.textViewOptionFour.setOnClickListener(this)
        binding.buttonCheck.setOnClickListener(this)

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

        if(currentPosition == questionsList.size) {
            binding.buttonCheck.text = "FINISH"
        }else {
            binding.buttonCheck.text = "CHECK"
        }
    }

    private fun resetOption() {
        val options = mutableListOf<TextView>()
        options.add(binding.textViewOptionOne)
        options.add(binding.textViewOptionTwo)
        options.add(binding.textViewOptionThree)
        options.add(binding.textViewOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this , R.drawable.border_default_option
            )
        }
    }

    private fun selectedOption(textView: TextView , selectedOptionNumber : Int) {
        resetOption()

        selectedOptionPosition = selectedOptionNumber

        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface , Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this , R.drawable.select_default_option
        )
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            binding.textViewOptionOne.id -> {
                selectedOption(binding.textViewOptionOne, 1)
            }

            binding.textViewOptionTwo.id -> {
                selectedOption(binding.textViewOptionTwo, 2)
            }

            binding.textViewOptionThree.id -> {
                selectedOption(binding.textViewOptionThree, 3)
            }

            binding.textViewOptionFour.id -> {
                selectedOption(binding.textViewOptionFour, 4)
            }

            binding.buttonCheck.id -> {

            }
        }
    }


}
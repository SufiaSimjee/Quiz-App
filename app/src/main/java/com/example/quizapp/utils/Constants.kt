package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.QuizQuestion

object Constants {

    fun getQuestions() : MutableList<QuizQuestion> {

        val quizQuestions = mutableListOf<QuizQuestion>()

        val quest1 = QuizQuestion(
            1 , "Which country does this flag belong to ?", R.drawable.india ,
            "India" , "Myanmar" ,
            "Thailand" , "Malaysia",
            1
        )

        quizQuestions.add(quest1)

        val quest2 = QuizQuestion(
            1 , "Which country does this flag belong to ?", R.drawable.china ,
            "India" , "Malaysia" ,
            "China" , "Myanmar",
            3
        )

        quizQuestions.add(quest2)

        val quest3 = QuizQuestion(
            1 , "Which country does this flag belong to ?", R.drawable.mexico,
            "America" , "Mexico" ,
            "Myanmar" , "Finland",
            2
        )

        quizQuestions.add(quest3)

        val quest4 = QuizQuestion(
            1 , "Which country does this flag belong to ?", R.drawable.japan ,
            "Myanmar" , "Singapore" ,
            "Mexico" , "Japan",
            4
        )

        quizQuestions.add(quest4)

        val quest5 = QuizQuestion(
            1 , "Which country does this flag belong to ?", R.drawable.myanmar ,
            "Myanmar" , "Japan" ,
            "Thailand" , "Singapore",
            1
        )

        quizQuestions.add(quest5)

        return quizQuestions
    }
}
package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {

    fun getQuestions() : MutableList<Question> {

        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1 , "Which country does this flag belong to", R.drawable.india ,
            "India" , "Myanmar" ,
            "Thailand" , "Malaysia",
            1
        )

        questions.add(quest1)

        val quest2 = Question(
            1 , "Which country does this flag belong to", R.drawable.china ,
            "India" , "Malaysia" ,
            "China" , "Myanmar",
            3
        )

        questions.add(quest2)

        val quest3 = Question(
            1 , "Which country does this flag belong to", R.drawable.mexico ,
            "America" , "Mexico" ,
            "Myanmar" , "Finland",
            2
        )

        questions.add(quest3)

        val quest4 = Question(
            1 , "Which country does this flag belong to", R.drawable.japan ,
            "Myanmar" , "Singapore" ,
            "Mexico" , "Japan",
            4
        )

        questions.add(quest4)

        val quest5 = Question(
            1 , "Which country does this flag belong to", R.drawable.myanmar ,
            "Myanmar" , "Japan" ,
            "Thailand" , "Singapore",
            1
        )

        questions.add(quest5)

        return questions
    }
}
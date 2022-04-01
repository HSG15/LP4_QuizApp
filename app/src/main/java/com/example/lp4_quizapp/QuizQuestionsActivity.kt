package com.example.lp4_quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.log


class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition : Int = 1
    private var mQuestionList:ArrayList<Question>?= null
    private var mSelectedOptionPosition : Int = 0
    private var progressBar : ProgressBar? = null
    private var tvProgressBar : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null
    private var option1 : TextView? = null
    private var option2 : TextView? = null
    private var option3 : TextView? = null
    private var option4 : TextView? = null
    private var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.flagImage)

        option1 = findViewById(R.id.tv_option1)
        option2 = findViewById(R.id.tv_option2)
        option3 = findViewById(R.id.tv_option3)
        option4 = findViewById(R.id.tv_option4)
        btnSubmit = findViewById(R.id.btn_submit)

        val questionList = Constants.getQuestions()
        //Log.i("Question list size is ,${questionList.size}")
        Log.i("Question list size is ","${questionList.size}")

        for (i in questionList)
        {
            Log.e("Questions",i.question)
        }
        setQuestion(questionList)
    }

    private fun setQuestion(questionList: ArrayList<Question>) {
        var currentPosition = 1
        val question: Question = questionList[currentPosition - 1]
        progressBar?.progress = currentPosition
        tvProgressBar?.text = "${currentPosition}/${progressBar?.max}"
        ivImage?.setImageResource(question.image)
        tvQuestion?.text = question.question
        option1?.text = question.option1
        option2?.text = question.option2
        option3?.text = question.option3
        option4?.text = question.option4
    }

    override fun onClick(p0: View?) {


    }
}
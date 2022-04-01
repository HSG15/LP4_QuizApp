package com.example.lp4_quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btn_start)
        val etName = findViewById<EditText>(R.id.et_name)

        btnStart.setOnClickListener {
            if (etName.text.isEmpty())
            {
                Toast.makeText(this,"Please enter the name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
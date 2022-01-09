package com.example.bookproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameBookEditText : EditText = findViewById(R.id.name_book_edit_text)
        val saveButton : Button = findViewById(R.id.button2)
        val infoTextView : TextView = findViewById(R.id.interactive_text_view)
        saveButton.setOnClickListener{
            val nameBook : String = nameBookEditText.text.toString()
            infoTextView.text = nameBook
        }
    }
}
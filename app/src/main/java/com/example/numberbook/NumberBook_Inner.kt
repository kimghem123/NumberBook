package com.example.numberbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import java.util.zip.Inflater

class NumberBook_Inner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_book_inner)

        val name =intent.getStringExtra("name")
        val phone = intent.getStringExtra("phoneNum")

        val nameText = findViewById<TextView>(R.id.number_book_inner_name)
        val phoneText = findViewById<TextView>(R.id.number_book_inner_phone)

        nameText.setText(name)
        phoneText.setText(phone)
    }
}
package com.example.numberbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class NumberBook_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_book1)

        val numberBook = makeNumber()
        creatNumberBook(numberBook)

        /*val numberList = ArrayList<numberBook>()
        for(i in 0 until 20){
            numberList.add(numberBook("hello${i}","01000000000"))
        }
        val container = findViewById<LinearLayout>(R.id.number_book_container)
        val inflater = layoutInflater
        for (i in 0 until numberList.size){
            val numberView = inflater.inflate(R.layout.number_view,null)
            val buttonView = numberView.findViewById<TextView>(R.id.number_btn)
            buttonView.setText(numberList.get(i).name)
            container.addView(numberView)
            numberView.setOnClickListener{
                val intent =Intent(this,NumberBook_Inner::class.java)
                intent.putExtra("name",numberList.get(i).name)
                intent.putExtra("phoneNum",numberList.get(i).number)
                startActivity(intent)
            }
        }*/

    }

    fun makeNumber(numberSize: Int = 10, person: Person = Person()): Person {
        for (i in 0 until numberSize) {
            person.addNumber(
                numberBook("hello${i}", "01000000000")
            )
        }
        return person
    }

    fun creatNumberBook(person: Person) {

        val container = findViewById<LinearLayout>(R.id.number_book_container)
        val inflater = layoutInflater

        for (i in 0 until person.numberList.size) {
            val numberView = inflater.inflate(R.layout.number_view, null)
            val textView = numberView.findViewById<TextView>(R.id.number_btn)
            textView.setText(person.numberList.get(i).name)
            container.addView(numberView)
            addClickListener(person.numberList.get(i),numberView)
        }

    }

    fun addClickListener(number: numberBook, view: View){
        view.setOnClickListener {
            val intent = Intent(this, NumberBook_Inner::class.java)
            intent.putExtra("name", number.name)
            intent.putExtra("phoneNum", number.number)
            startActivity(intent)
        }
    }

}

class Person() {
    val numberList = ArrayList<numberBook>()

    fun addNumber(number: numberBook) {
        numberList.add(number)
    }

}

class numberBook(val name: String, val number: String) {

}
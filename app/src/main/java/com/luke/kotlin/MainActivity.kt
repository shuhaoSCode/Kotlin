package com.luke.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    var a = "luke";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.test_tv)
        textView.text = "嘿嘿$a,${textView.text.toString().replace("text", "fuck")}"
        textView.textSize = 40f
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

}

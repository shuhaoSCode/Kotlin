package com.luke.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.shuhao.uiimageview.UIImageView

class MainActivity : AppCompatActivity() {

    var testView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testView = findViewById(R.id.test_tv)


    }


}

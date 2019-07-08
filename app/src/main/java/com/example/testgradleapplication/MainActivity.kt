package com.example.testgradleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.TestClass

class MainActivity : AppCompatActivity() {

    val a get() = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestClass()
    }
}

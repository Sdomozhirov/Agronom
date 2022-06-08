package com.sdomozhirov.agronom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var number:Int = 0
    private val string: String = "beginning"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.covid_19tracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        materialButton3.setOnClickListener {
            Intent(this,TrackerActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
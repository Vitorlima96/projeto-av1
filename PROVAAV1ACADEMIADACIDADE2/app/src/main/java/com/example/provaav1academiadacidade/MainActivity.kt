package com.example.provaav1academiadacidade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //button
        val mStartActBtn = findViewById<Button>(R.id.startActBtn)
        //handle button click
        mStartActBtn.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@MainActivity, TELA2::class.java ))
        }
    }
}
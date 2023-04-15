package com.example.provaav1academiadacidade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TELA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        //button
        val buttonTELA3 = findViewById<Button>(R.id.button3)
        //handle button click
        buttonTELA3.setOnClickListener {
            //start activity intent
            startActivity(Intent(this@TELA2, TELA3::class.java ))
        }
    }
}
package com.HR.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //code
        val button_next = findViewById<Button>(R.id.btn_next)

        button_next.setOnClickListener{
            intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)

        }
        }
    }
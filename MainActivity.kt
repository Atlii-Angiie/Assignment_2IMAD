package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val btnWoof=findViewById<Button>(R.id.btnWoof)
        btnWoof.setOnClickListener{
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            }

    }
}
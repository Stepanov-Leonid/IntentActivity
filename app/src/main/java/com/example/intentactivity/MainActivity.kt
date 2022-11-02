package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button =findViewById(R.id.btn_intent)
        button.setOnClickListener {
            Log.d("TAG","Intent")
            val MyIntent= Intent(this, MainActivity2::class.java)
            startActivity(MyIntent)
        }


    }
}
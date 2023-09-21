package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val home = findViewById<ImageView>(R.id.homel)

        val info = findViewById<TextView>(R.id.information)
        val fee = "1. This is app is for educational purpose.\n"+
                "----------------------------------------------------------\n"+
                "2. You can read story and biography of historical personality.\n"+
                "----------------------------------------------------------\n"+
                "3. In Biography persons are divided on their birth year.\n"+
                "----------------------------------------------------------\n"+
                "4. You can use this app in offline mode.\n"+
                "----------------------------------------------------------\n"
        info.text = fee
        home.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}
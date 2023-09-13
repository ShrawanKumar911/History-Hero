package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    private lateinit var bio:Button
    private lateinit var sto:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bio = findViewById(R.id.biography)
        sto = findViewById(R.id.story)

        bio.setOnClickListener(){
            val intent = Intent(this,BioYear::class.java)
            startActivity(intent)
        }
        sto.setOnClickListener(){
            val intent = Intent(this,StoYear::class.java)
            startActivity(intent)
        }
    }
}
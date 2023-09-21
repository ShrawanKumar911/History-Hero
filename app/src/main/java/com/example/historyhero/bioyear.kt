package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class bioyear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio_year)

        val hel = findViewById<ImageView>(R.id.helpl)
        val home = findViewById<ImageView>(R.id.homel)
        val feed = findViewById<ImageView>(R.id.feedbackl)
        hel.setOnClickListener(){
            val intent = Intent(this,help::class.java)
            startActivity(intent)
        }
        home.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
        feed.setOnClickListener(){
            val intent = Intent(this,feedback::class.java)
            startActivity(intent)
        }

        val first = findViewById<CardView>(R.id.first)
        first.setOnClickListener(){
            val intent = Intent(this,storycontent::class.java)
            intent.putExtra("Content",0)
            startActivity(intent)
        }
        val second = findViewById<CardView>(R.id.second)
        second.setOnClickListener(){
            val intent = Intent(this,storycontent::class.java)
            intent.putExtra("Content",1)
            startActivity(intent)
        }
        val third = findViewById<CardView>(R.id.third)
        third.setOnClickListener(){
            val intent = Intent(this,storycontent::class.java)
            intent.putExtra("Content",2)
            startActivity(intent)
        }
        val forth = findViewById<CardView>(R.id.forth)
        forth.setOnClickListener(){
            val intent = Intent(this,storycontent::class.java)
            intent.putExtra("Content",3)
            startActivity(intent)
        }
        val fifth = findViewById<CardView>(R.id.fifth)
        fifth.setOnClickListener(){
            val intent = Intent(this,storycontent::class.java)
            intent.putExtra("Content",4)
            startActivity(intent)
        }
    }
}
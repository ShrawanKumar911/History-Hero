package com.example.historyhero

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class feedback : AppCompatActivity() {
    private lateinit var submit : Button
    private lateinit var fb : EditText

    private  lateinit var database : FirebaseDatabase
    private lateinit var userReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_feedback)

        val hel = findViewById<ImageView>(R.id.helpl)
        val home = findViewById<ImageView>(R.id.homel)

        hel.setOnClickListener(){
            val intent = Intent(this,help::class.java)
            startActivity(intent)
        }
        home.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
        submit = findViewById(R.id.submit)
        fb = findViewById(R.id.feed)

        database = FirebaseDatabase.getInstance()
        userReference=database.getReference("feedback")

        submit.setOnClickListener(){
            val feedback = fb.text.toString()
            if (feedback.isNullOrEmpty()){
                showToast("Write Feedback")
                return@setOnClickListener
            }
            val fee = Use(feedback)

            userReference.push().setValue(fee)
                .addOnSuccessListener {
                    showToast("Feedback Submitted Successfully")
                    fb.text.clear()
                }
                .addOnFailureListener(){
                    showToast("Failed to submit Feedback")
                }

        }
    }
    fun showToast(m:String){
        Toast.makeText(this,m,Toast.LENGTH_SHORT).show()
    }
}

data class Use(val feed : String)
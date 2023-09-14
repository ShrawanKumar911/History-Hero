package com.example.historyhero

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class Home : AppCompatActivity() {
    private lateinit var bio:Button
    private lateinit var sto:Button
    private lateinit var logout: TextView
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bio = findViewById(R.id.biography)
        sto = findViewById(R.id.story)
        logout = findViewById(R.id.back)
        auth = FirebaseAuth.getInstance()
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        logout.setOnClickListener{
            auth.signOut()

            val editor = sharedPreferences.edit()
            editor.putBoolean("isLoggedIn",false)
            editor.apply()

            val change = Intent(this,MainActivity::class.java)
            startActivity(change)
            finish()
        }

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
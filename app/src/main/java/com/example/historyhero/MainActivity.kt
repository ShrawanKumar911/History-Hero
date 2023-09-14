package com.example.historyhero

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var user:EditText
    private lateinit var pass:EditText
    private lateinit var log:Button
    private lateinit var signup:TextView
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user=findViewById(R.id.username)
        pass = findViewById(R.id.password)
        log = findViewById(R.id.login)
        signup = findViewById(R.id.signup)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        auth = FirebaseAuth.getInstance()
        if (sharedPreferences.getBoolean("isLoggedIn", false)) {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }

        log.setOnClickListener(){
            val username = user.text.toString()
            val password = pass.text.toString()

            if (username.isNullOrEmpty() || password.isNullOrEmpty()){
                showToast("Fill Username and Password")
            }else{
                auth.signInWithEmailAndPassword(username , password)
                    .addOnCompleteListener(this){task ->
                        if (task.isSuccessful){
                            val editor = sharedPreferences.edit()
                            editor.putBoolean("isLoggedIn", true)
                            editor.apply()

                            val intent = Intent(this,Home::class.java)
                            startActivity(intent)
                            finish()
                        }else{
                            showToast("Username or Password is incorrect")
                        }
                    }
            }
        }
        signup.setOnClickListener(){
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

    }
    fun showToast( message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
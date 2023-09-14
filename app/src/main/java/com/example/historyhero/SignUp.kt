package com.example.historyhero

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignUp : AppCompatActivity() {

    private lateinit var userFirst:EditText
    private lateinit var userLast:EditText
    private lateinit var userAge:EditText
    private lateinit var userGender:EditText
    private lateinit var userEmail:EditText
    private lateinit var userPass:EditText
    private lateinit var button:Button
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        userFirst = findViewById(R.id.first)
        userLast = findViewById(R.id.last)
        userAge = findViewById(R.id.age)
        userGender = findViewById(R.id.gender)
        userEmail = findViewById(R.id.email)
        userPass = findViewById(R.id.password)
        button = findViewById(R.id.submit)

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        auth = FirebaseAuth.getInstance()
        if(sharedPreferences.getBoolean("isLoggedIn",false))
        {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
            finish()
        }

        button.setOnClickListener(){
            val firstName = userFirst.text.toString()
            val lastName = userLast.text.toString()
            val age = userAge.text.toString()
            val gender = userGender.text.toString()
            val email = userEmail.text.toString()
            val password = userPass.text.toString()

            if (firstName.isNullOrEmpty() || lastName.isNullOrEmpty() || age.isNullOrEmpty() || gender.isNullOrEmpty() || email.isNullOrEmpty() || password.isNullOrEmpty()){
                showToast("Fill All Detail Properly")
            }else{
                auth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(this){task ->
                    if (task.isSuccessful){
                        val editor = sharedPreferences.edit()
                        editor.putBoolean("isLoggedIn", true)
                        editor.apply()

                        val change = Intent(this, MainActivity::class.java)
                        startActivity(change)
                        finish()
                    }else{
                        showToast("Registration failed. Please try again.")
                    }
                    }
            }
        }

    }
    fun showToast(message : String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
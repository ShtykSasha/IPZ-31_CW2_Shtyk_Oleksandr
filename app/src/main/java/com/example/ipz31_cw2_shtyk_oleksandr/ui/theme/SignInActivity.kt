package com.example.ipz31_cw2_shtyk_oleksandr.ui.theme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signInButton: Button
    private lateinit var signInSuccessText: TextView
    private lateinit var emailText: TextView
    private lateinit var signOutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        signInButton = findViewById(R.id.signInButton)
        signInSuccessText = findViewById(R.id.signInSuccessText)
        emailText = findViewById(R.id.emailText)
        signOutButton = findViewById(R.id.signOutButton)


        signInButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                showSignInSuccess(email)
            }
        }


        signOutButton.setOnClickListener {
            showSignIn()
        }
    }


    private fun showSignIn() {
        signInSuccessText.visibility = View.GONE
        emailText.visibility = View.GONE
        signOutButton.visibility = View.GONE
        emailEditText.setText("")
        passwordEditText.setText("")
        signInButton.visibility = View.VISIBLE
        emailEditText.visibility = View.VISIBLE
        passwordEditText.visibility = View.VISIBLE
    }


    private fun showSignInSuccess(email: String) {
        signInSuccessText.visibility = View.VISIBLE
        emailText.visibility = View.VISIBLE
        signOutButton.visibility = View.VISIBLE
        signInButton.visibility = View.GONE
        emailEditText.visibility = View.GONE
        passwordEditText.visibility = View.GONE


        emailText.text = "Email: $email"
    }
}
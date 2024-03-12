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

        // Знаходимо всі елементи у макеті за їхніми ідентифікаторами
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        signInButton = findViewById(R.id.signInButton)
        signInSuccessText = findViewById(R.id.signInSuccessText)
        emailText = findViewById(R.id.emailText)
        signOutButton = findViewById(R.id.signOutButton)
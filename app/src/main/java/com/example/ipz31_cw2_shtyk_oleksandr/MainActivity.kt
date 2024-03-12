package com.example.ipz31_cw2_shtyk_oleksandr

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var signInLayout: RelativeLayout
    private lateinit var signInSuccessLayout: RelativeLayout
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var textViewEmail: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Знаходимо елементи у макеті за їхніми ідентифікаторами
        signInLayout = findViewById(R.id.signInLayout)
        signInSuccessLayout = findViewById(R.id.signInSuccessLayout)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        textViewEmail = findViewById(R.id.textViewEmail)

        val buttonSignIn: Button = findViewById(R.id.buttonSignIn)
        val buttonSignOut: Button = findViewById(R.id.buttonSignOut)

        // Додаємо обробник натискання на кнопку Sign In
        buttonSignIn.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Якщо поля Email та Password не порожні, переключаємо стан на "Sign In success"
                showSignInSuccess()
            }
        }

        // Додаємо обробник натискання на кнопку Sign Out
        buttonSignOut.setOnClickListener {
            // Переключаємо стан на "Sign In" та очищаємо поля введення
            showSignIn()
        }
    }

    // Функція для переключення на екран "Sign In"
    private fun showSignIn() {
        signInLayout.visibility = View.VISIBLE // Робимо екран "Sign In" видимим
        signInSuccessLayout.visibility = View.GONE // Ховаємо екран "Sign In success"
        editTextEmail.setText("") // Очищаємо поле введення Email
        editTextPassword.setText("") // Очищаємо поле введення Password
    }

    // Функція для переключення на екран "Sign In success"
    private fun showSignInSuccess() {
        signInLayout.visibility = View.GONE // Ховаємо екран "Sign In"
        signInSuccessLayout.visibility = View.VISIBLE // Робимо екран "Sign In success" видимим
    }
}

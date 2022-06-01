package dev.nadine.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvSignup: TextView
    lateinit var  etEmail:TextInputEditText
    lateinit var etPassword:TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        tvSignup = findViewById(R.id.tvSignUp)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tilEmail = findViewById(R.id.tilEmail)
        tilPassword =findViewById(R.id.tilPassword)
        tvSignup.setOnClickListener {
            val intent =Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
       btnLogin.setOnClickListener {
           validateLogin()
       }
    }
    fun validateLogin(){
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        if(email.isBlank()){
            tilEmail.error = "Email is invalid"
        }
        if(password.isBlank()){
            tilPassword.error = "Password is required"
        }
    }
}
package dev.nadine.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.nadine.workoutlog.databinding.ActivityHomeBinding
import dev.nadine.workoutlog.databinding.ActivityLogin2Binding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLogin2Binding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)
//        tvSignup = findViewById(R.id.tvSignUp)
//        etEmail = findViewById(R.id.etEmail)
//        etPassword = findViewById(R.id.etPassword)
//        btnLogin = findViewById(R.id.btnLogin)
//        tilEmail = findViewById(R.id.tilEmail)
//        tilPassword =findViewById(R.id.tilPassword)
        binding.tvSignUp.setOnClickListener{

            var intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }
       binding.btnLogin.setOnClickListener {
           validateLogin()
           val intent = Intent(this,HomeActivity::class.java)
           startActivity(intent)
       }
    }
    fun validateLogin(){
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        if(email.isBlank()){
            binding.tilEmail.error = "Email is invalid"
        }
        if(password.isBlank()){
           binding. tilPassword.error = "Password is required"
        }

    }
}
// A fragment is  a reusable portion of the UI


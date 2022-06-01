package dev.nadine.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
   lateinit var tilFirstname:TextInputLayout
   lateinit var tilLastname:TextInputLayout
   lateinit var tilSignupEmail:TextInputLayout
   lateinit var etFirstname:TextInputEditText
   lateinit var etLastname:TextInputEditText
   lateinit var etSignupEmail: TextInputEditText
   lateinit var tilSignupPassword:TextInputLayout
   lateinit var etSignupPassword:TextInputEditText
   lateinit var tilConfirm:TextInputLayout
   lateinit var etConfirm:TextInputEditText
   lateinit var btnSignup:Button
   lateinit var tvLogin:TextView

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        tilFirstname = findViewById(R.id.tilFirstname)
       tilLastname = findViewById(R.id.tilLastname)
       tilSignupEmail = findViewById(R.id.tilSignupEmail)
       tilSignupPassword = findViewById(R.id.tilSignupPassword)
       tilConfirm = findViewById(R.id.tilConfirm)
       etFirstname = findViewById(R.id.etFirstname)
       etLastname = findViewById(R.id.etLastname)
       etSignupEmail = findViewById(R.id.etSignupEmail)
       etSignupPassword = findViewById(R.id.etSignupPassword)
       etConfirm = findViewById(R.id.etConfirm)
       btnSignup = findViewById(R.id.btnSignup)
       tvLogin = findViewById(R.id.tvLogin)
       btnSignup.setOnClickListener {
           val intent = Intent(this,PlanActivity::class.java)
           startActivity(intent)
       }
       btnSignup.setOnClickListener {
           validateSignup()
     }
   }
 fun validateSignup(){
       var firstname = etFirstname.text.toString()
       var lastname = etLastname.text.toString()
       var email = etSignupEmail.text.toString()
     var signUpPassword = etSignupPassword.text.toString()
     var  confirm = etConfirm.text.toString()


    if (firstname.isBlank()){
         tilFirstname.error = "Input required"
      }
      if (lastname.isBlank()){
           tilLastname.error = "Input required"
       }
       if (email.isBlank()){
           tilSignupEmail.error = "Email invalid"
       }
     if (signUpPassword.isBlank()){
         tilSignupPassword.error = "Password required"
     }
     if (confirm.isBlank()){
         tilConfirm.error = "confirm your password"
     }
   }
 }


//fun validateLogin(){
//    var email = etEmail.text.toString()
//    var password = etPassword.text.toString()
//    if(email.isBlank()){
//        tilEmail.error = "Email is invalid"
//    }
//    if(password.isBlank()){
//        tilPassword.error = "Password is required"
//    }
//}
//}
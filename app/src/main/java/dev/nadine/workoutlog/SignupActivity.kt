package dev.nadine.workoutlog

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.nadine.workoutlog.databinding.ActivitySignupBinding


class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
//   lateinit var tilFirstname:TextInputLayout
//   lateinit var tilLastname:TextInputLayout
//   lateinit var tilSignupEmail:TextInputLayout
//   lateinit var etFirstname:TextInputEditText
//   lateinit var etLastname:TextInputEditText
//   lateinit var etSignupEmail: TextInputEditText
//   lateinit var tilSignupPassword:TextInputLayout
//   lateinit var etSignupPassword:TextInputEditText
//   lateinit var tilConfirm:TextInputLayout
//   lateinit var etConfirm:TextInputEditText
//   lateinit var btnSignup:Button
//   lateinit var tvLogin:TextView

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        tilFirstname = findViewById(R.id.tilFirstname)
//       tilLastname = findViewById(R.id.tilLastname)
//       tilSignupEmail = findViewById(R.id.tilSignupEmail)
//       tilSignupPassword = findViewById(R.id.tilSignupPassword)
//       tilConfirm = findViewById(R.id.tilConfirm)
//       etFirstname = findViewById(R.id.etFirstname)
//       etLastname = findViewById(R.id.etLastname)
//       etSignupEmail = findViewById(R.id.etSignupEmail)
//       etSignupPassword = findViewById(R.id.etSignupPassword)
//       etConfirm = findViewById(R.id.etConfirm)
//       btnSignup = findViewById(R.id.btnSignup)
//       tvLogin = findViewById(R.id.tvLogin)
       binding.tvLogin.setOnClickListener {
           val intent = Intent(this,LoginActivity::class.java)
           startActivity(intent)
       }
      binding. btnSignup.setOnClickListener {
           validateSignup()
     }
   }
 fun validateSignup(){
       var firstname = binding.etFirstname.text.toString()
       var lastname = binding.etLastname.text.toString()
       var email =binding. etSignupEmail.text.toString()
     var signUpPassword = binding.etSignupPassword.text.toString()
     var  confirm = binding.etConfirm.text.toString()

     binding.etSignupEmail.addTextChangedListener(object : TextWatcher {
         override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
             binding.tilSignupEmail.error = null

             // TODO Auto-generated method stub
         }

         override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

             // TODO Auto-generated method stub
         }

         override fun afterTextChanged(s: Editable) {

             // TODO Auto-generated method stub
         }
     })
    if (firstname.isBlank()){
         binding.tilFirstname.error = "Input required"
      }
      if (lastname.isBlank()){
           binding.tilLastname.error = "Input required"
       }
       if (email.isBlank()){
           binding.tilSignupEmail.error = "Email invalid"
       }
     if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
        binding. tilSignupEmail.error = "Email is invalid"
     }
     if (signUpPassword.isBlank()){
         binding.tilSignupPassword.error = "Password required"
     }
     if (confirm.isBlank()){
        binding. tilConfirm.error = "confirm your password"
     }
     if (confirm!= signUpPassword){
         binding.tilConfirm.error = "Enter the same password"
     }
   }
 }
//
//if confirm != password{
//    tilConfirm.error="Password does not match"
//}
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
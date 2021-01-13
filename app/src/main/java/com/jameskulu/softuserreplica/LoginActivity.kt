package com.jameskulu.softuserreplica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {
            if(validation()) {
                if ((etUsername.text.toString() == "softwarica") && (etPassword.text.toString() == "coventry")) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    etUsername.error = "Invalid Username/Password"
                    etUsername.requestFocus()
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun validation():Boolean{
        var isEmpty:Boolean = true

        when {
            TextUtils.isEmpty(etUsername.text) -> {
                etUsername.error = "Enter your username."
                etUsername.requestFocus()
                isEmpty = false
            }
            TextUtils.isEmpty(etPassword.text) -> {
                etPassword.error = "Enter your password."
                etPassword.requestFocus()
                isEmpty = false
            }
        }
        return isEmpty
    }
}
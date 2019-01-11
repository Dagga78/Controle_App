package com.example.jerom.controle_app.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jerom.controle_app.PrefsModel
import com.example.jerom.controle_app.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            PrefsModel.userMail = editMail.text.toString()
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}

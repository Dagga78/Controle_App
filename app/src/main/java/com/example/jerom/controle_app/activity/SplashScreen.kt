package com.example.jerom.controle_app.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.jerom.controle_app.PrefsModel
import com.example.jerom.controle_app.R

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({

            val intent: Intent = if (PrefsModel.userMail.isEmpty())
                Intent(applicationContext, LoginActivity::class.java)
            else
                Intent(applicationContext, MainActivity::class.java)

            startActivity(intent)
            finish()

        }, 1000)
    }

}

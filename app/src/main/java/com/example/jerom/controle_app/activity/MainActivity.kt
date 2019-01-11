package com.example.jerom.controle_app.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.jerom.controle_app.PrefsModel
import com.example.jerom.controle_app.R
import com.example.jerom.controle_app.fragment.Api_Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(Api_Fragment())
    }

    fun menuClick(view: View) {
        when (view.id) {
            R.id.button2 -> replaceFragment(Api_Fragment())
            R.id.button -> {
                val intent = Intent(applicationContext, MapsActivity::class.java)
                startActivity(intent)
            }
            R.id.button3 -> {
                PrefsModel.userMail = ""
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }


        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, fragment)
            .commit()
    }
}

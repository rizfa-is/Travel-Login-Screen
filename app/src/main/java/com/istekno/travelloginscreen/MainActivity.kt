package com.istekno.travelloginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        supportActionBar?.hide()

        btn_forgot_pass.setOnClickListener{
            Toast.makeText(this, "Click Forgot Password", Toast.LENGTH_SHORT).show()
        }

        btn_login.setOnClickListener{
            Toast.makeText(this, "Click Login", Toast.LENGTH_SHORT).show()
        }

        btn_register.setOnClickListener{
            Toast.makeText(this, "Click Register Now", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun masuk(view: View?) {
        val i = Intent(applicationContext, DashboardAdmin::class.java)
        startActivity(i)
    }

    fun buatakun(view: View?) {
        val i = Intent(applicationContext, Registrasi::class.java)
        startActivity(i)
    }
}
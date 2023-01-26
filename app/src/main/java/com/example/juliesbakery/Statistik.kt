package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Statistik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistik)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, DashboardAdmin3::class.java)
        startActivity(i)
    }
}
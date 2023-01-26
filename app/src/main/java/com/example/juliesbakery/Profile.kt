package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, DashboardDataPelanggan::class.java)
        startActivity(i)
    }
}
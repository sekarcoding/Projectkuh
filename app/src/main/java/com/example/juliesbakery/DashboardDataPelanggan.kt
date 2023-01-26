package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardDataPelanggan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_data_pelanggan)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, DashboardAdmin3::class.java)
        startActivity(i)
    }

    fun lihat1(view: View?) {
        val i = Intent(applicationContext, Profile::class.java)
        startActivity(i)
    }
}
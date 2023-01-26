package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class JumlahPengunjung : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jumlah_pengunjung)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, DashboardAdmin::class.java)
        startActivity(i)
    }
}
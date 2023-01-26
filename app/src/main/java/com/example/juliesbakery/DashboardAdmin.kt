package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardAdmin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_admin)
    }

    fun datapelanggan(view: View?) {
        val i = Intent(applicationContext, DataPelanggan::class.java)
        startActivity(i)
    }

    fun jumlahpelanggan(view: View?) {
        val i = Intent(applicationContext, JumlahPengunjung::class.java)
        startActivity(i)
    }

    fun keluar(view: View?) {
        val i = Intent(applicationContext, MainActivity::class.java)
        startActivity(i)
    }
}
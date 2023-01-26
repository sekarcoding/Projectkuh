package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardAdmin3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_admin3)
    }

    fun profile1(view: View?) {
        val i = Intent(applicationContext, Profile::class.java)
        startActivity(i)
    }

    fun lihat1(view: View?) {
        val i = Intent(applicationContext, DashboardDataPelanggan::class.java)
        startActivity(i)
    }

    fun lihat2(view: View?) {
        val i = Intent(applicationContext, Statistik::class.java)
        startActivity(i)
    }

    fun lihat3(view: View?) {
        val i = Intent(applicationContext, EditPilihanKue::class.java)
        startActivity(i)
    }

    fun totalpengunjung(view: View?) {
        val i = Intent(applicationContext, Statistik::class.java)
        startActivity(i)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, DashboardAdmin::class.java)
        startActivity(i)
    }
}
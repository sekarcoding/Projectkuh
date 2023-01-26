package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EditPilihanKue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_pilihan_kue)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, DashboardAdmin3::class.java)
        startActivity(i)
    }

    fun tambah(view: View?) {
        val i = Intent(applicationContext, TambahKue::class.java)
        startActivity(i)
    }

    fun edit(view: View?) {
        val i = Intent(applicationContext, EditKue::class.java)
        startActivity(i)
    }
}
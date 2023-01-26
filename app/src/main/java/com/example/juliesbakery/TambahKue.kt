package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TambahKue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_kue)
    }

    fun simpan(view: View?) {
        val i = Intent(applicationContext, EditPilihanKue::class.java)
        startActivity(i)
    }
}
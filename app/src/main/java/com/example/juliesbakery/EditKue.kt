package com.example.juliesbakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EditKue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_kue)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, EditPilihanKue::class.java)
        startActivity(i)
    }
}
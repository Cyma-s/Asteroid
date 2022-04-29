package com.example.asteroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asteroid.login.StartPage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nextIntent = Intent(this, StartPage::class.java)
        startActivity(nextIntent)
    }
}
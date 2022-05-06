package com.example.asteroid.login

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.asteroid.R
import com.example.asteroid.databinding.ActivityUserNamePageBinding

class UserNamePage : AppCompatActivity() {
    private lateinit var binding: ActivityUserNamePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_name_page)
        binding.nextButton.setOnClickListener {
            ActivityCompat.finishAffinity(this)
            val i = Intent(this, LoginPage::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or FLAG_ACTIVITY_NEW_TASK)
            startActivity(i)
            finish()
        }
    }
}
package com.example.asteroid.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.asteroid.R
import com.example.asteroid.databinding.ActivityStartPageBinding

class StartPage : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityStartPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start_page)
        binding.loginButton.setOnClickListener(this)
        binding.signUpButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.login_button -> startActivity(Intent(this, LoginPage::class.java))
            R.id.sign_up_button -> startActivity(Intent(this, SignUpStartNamePage::class.java))
        }
    }
}
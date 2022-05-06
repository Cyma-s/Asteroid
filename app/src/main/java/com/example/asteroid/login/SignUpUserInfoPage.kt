package com.example.asteroid.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.asteroid.R
import com.example.asteroid.databinding.ActivitySignUpStartNamePageBinding
import com.example.asteroid.databinding.ActivitySignUpUserInfoPageBinding

class SignUpUserInfoPage : AppCompatActivity(){
    private lateinit var binding: ActivitySignUpUserInfoPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up_user_info_page)
        binding.nextButton.setOnClickListener {
            startActivity(Intent(this, StartPage::class.java))
        }
    }
}
package com.example.asteroid.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.asteroid.R
import com.example.asteroid.databinding.ActivitySignUpStartNamePageBinding

class SignUpStartNamePage : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySignUpStartNamePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up_start_name_page)
        binding.changeColorButton.setOnClickListener(this)
        binding.nextButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.next_button -> startActivity(Intent(this, SignUpUserInfoPage::class.java))
            R.id.change_color_button -> changeStarColor()
        }
    }

    private fun changeStarColor() {
        TODO("ColorPicker setting")
    }
}
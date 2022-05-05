package com.example.asteroid.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.example.asteroid.R
import com.example.asteroid.databinding.ActivitySignUpStartNamePageBinding
import com.github.dhaval2404.colorpicker.ColorPickerDialog
import com.github.dhaval2404.colorpicker.model.ColorShape

class SignUpStartNamePage : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySignUpStartNamePageBinding
    private var starColor : Int = R.color.basic_blue_color
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up_start_name_page)
        binding.changeColorButton.setOnClickListener(this)
        binding.nextButton.setOnClickListener(this)
        binding.starNameEdittext.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.next_button -> {
                val intent = Intent(this, SignUpUserInfoPage::class.java)
                val starName = binding.starNameEdittext.text
                intent.putExtra("starColor", starColor)
                intent.putExtra("starName", starName)
                startActivity(intent)
            }
            R.id.change_color_button -> changeStarColor()
        }
    }

    private fun changeStarColor() {
        ColorPickerDialog
            .Builder(this)
            .setTitle("별의 색깔을 고르세요")
            .setColorShape(ColorShape.CIRCLE)
            .setDefaultColor(R.color.basic_blue_color)
            .setColorListener{ color, _ ->
                binding.starColor.setColorFilter(color)
                starColor = color
            }
            .show()
    }
}
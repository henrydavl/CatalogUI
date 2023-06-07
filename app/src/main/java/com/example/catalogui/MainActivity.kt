package com.example.catalogui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catalogui.databinding.ActivityMainBinding
import com.example.core.ui.util.Constant

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTest.text = Constant.masSony
    }
}
package com.example.catalogui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.core.ui.util.Constant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print(Constant.masSony)
    }
}
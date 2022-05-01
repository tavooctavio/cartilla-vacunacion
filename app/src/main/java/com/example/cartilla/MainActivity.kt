package com.example.cartilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation:BottomNavigationView = findViewById(R.id.botton_nav)

        bottomNavigation.setOnItemSelectedListener {
            item ->
            when(item.itemId){
                R.id.home ->{
                    return@setOnItemSelectedListener true
                }
                R.id.profile ->{
                    return@setOnItemSelectedListener true
                }
                R.id.shot ->{
                    return@setOnItemSelectedListener true
                }
            }
        }
    }
}
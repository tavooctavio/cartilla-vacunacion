package com.example.cartilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var toolbar: ActionBar

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!

        val bottomNavigation:BottomNavigationView = findViewById(R.id.botton_nav)

        toolbar.title = "Home"
        val homeFragment = Home.newInstance()
        changeFragmnet(homeFragment)

        bottomNavigation.setOnItemSelectedListener {
            item ->
            when(item.itemId){
                R.id.home ->{
                    toolbar.title = "Home"
                    val homeFragment = Home.newInstance()
                    changeFragmnet(homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.profile ->{
                    toolbar.title = "Profile"
                    val profileFragment = Profile.newInstance()
                    changeFragmnet(profileFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.shot ->{
                    toolbar.title = "Shote"
                    val homeFragment = Shot.newInstance()
                    changeFragmnet(homeFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun changeFragmnet(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
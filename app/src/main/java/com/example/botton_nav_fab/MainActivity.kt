package com.example.botton_nav_fab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottom_navigation_view:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation_view = findViewById(R.id.bottom_navigation_view)


        bottom_navigation_view.background=null
        bottom_navigation_view.menu.getItem(2).isEnabled=false
    }
}
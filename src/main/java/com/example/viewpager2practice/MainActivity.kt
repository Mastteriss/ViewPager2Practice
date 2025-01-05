package com.example.viewpager2practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2practice.models.OnBoardFragmentBankModel
import com.example.viewpager2practice.utils.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager:ViewPager2
    private lateinit var adapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        adapter = ViewPagerAdapter(this,
            OnBoardFragmentBankModel.viewPagerList)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter


    }
}
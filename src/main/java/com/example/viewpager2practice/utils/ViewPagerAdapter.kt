package com.example.viewpager2practice.utils

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2practice.fragments.ViewPagerFragment
import com.example.viewpager2practice.models.OnBoardFragmentBankModel

class ViewPagerAdapter (
    fragment: FragmentActivity,
    private val viewPagerList:MutableList<OnBoardFragmentBankModel>
): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return viewPagerList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to viewPagerList[position])
        return fragment
    }
}
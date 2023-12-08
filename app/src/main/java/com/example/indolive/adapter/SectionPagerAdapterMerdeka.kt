package com.example.indolive.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.indolive.ui.MerdekaDuniaFragment
import com.example.indolive.ui.MerdekaFragment
import com.example.indolive.ui.MerdekaJakartaFragment
import com.example.indolive.ui.MerdekaTerbaruFragment

class SectionPagerAdapterMerdeka(fa: MerdekaFragment): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> MerdekaTerbaruFragment()
            1 -> MerdekaJakartaFragment()
            2 -> MerdekaDuniaFragment()
            else -> MerdekaTerbaruFragment()
        }
    }
}
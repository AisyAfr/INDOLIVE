package com.example.indolive.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.indolive.ui.OkezoneCelebrityFragment
import com.example.indolive.ui.OkezoneFragment
import com.example.indolive.ui.OkezoneSports
import com.example.indolive.ui.OkezoneTerbaruFragment

class SectionPagerAdapterOkezone(fa: OkezoneFragment): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> OkezoneTerbaruFragment()
            1 -> OkezoneSports()
            2 -> OkezoneCelebrityFragment()
            else -> OkezoneTerbaruFragment()
        }
    }
}
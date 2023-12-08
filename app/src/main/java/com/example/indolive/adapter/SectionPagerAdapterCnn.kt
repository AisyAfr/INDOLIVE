package com.example.indolive.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.indolive.ui.CnnFragment
import com.example.indolive.ui.CnnInternasionalFragment
import com.example.indolive.ui.CnnNasionalFragment
import com.example.indolive.ui.CnnTerbaruFragment

class SectionPagerAdapterCnn(fa: CnnFragment): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CnnTerbaruFragment()
            1 -> CnnNasionalFragment()
            2 -> CnnInternasionalFragment()
            else -> CnnTerbaruFragment()
        }
    }
}
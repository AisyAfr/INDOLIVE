package com.example.indolive.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.indolive.R
import com.example.indolive.adapter.NewsAdapter
import com.example.indolive.adapter.SectionPagerAdapterMerdeka
import com.example.indolive.adapter.SectionPagerAdapterOkezone
import com.example.indolive.data.repository.NewsRepository
import com.example.indolive.databinding.FragmentOkezoneBinding
import com.example.indolive.utils.NewsViewModelFactory
import com.google.android.material.tabs.TabLayoutMediator


class OkezoneFragment : Fragment() {

    private lateinit var binding : FragmentOkezoneBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOkezoneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.vpNews.adapter = SectionPagerAdapterOkezone(this)

        val tabList = arrayOf(
            "Terbaru",
            "Sports",
            "Celebrity"
        )

        TabLayoutMediator(binding.tabs, binding.vpNews) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
    }


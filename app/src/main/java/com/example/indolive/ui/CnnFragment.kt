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
import com.example.indolive.adapter.SectionPagerAdapterCnn
import com.example.indolive.data.repository.NewsRepository
import com.example.indolive.databinding.FragmentCnnBinding
import com.example.indolive.utils.NewsViewModelFactory
import com.google.android.material.tabs.TabLayoutMediator

class CnnFragment : Fragment() {

        private lateinit var binding: FragmentCnnBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentCnnBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.vpNews.adapter = SectionPagerAdapterCnn(this)

            val tabList = arrayOf(
                "Terbaru",
                "Nasional",
                "Internasional"
            )

            TabLayoutMediator(binding.tabs, binding.vpNews) {tab, position ->
                tab.text = tabList[position]
            }.attach()
        }

    }


package com.example.indolive.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.indolive.R
import com.example.indolive.adapter.NewsAdapter
import com.example.indolive.data.repository.NewsRepository
import com.example.indolive.databinding.FragmentOkezoneSportsBinding
import com.example.indolive.utils.NewsViewModelFactory


class OkezoneSports : Fragment() {

    private lateinit var binding:FragmentOkezoneSportsBinding

    private val okezoneSportsViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOkezoneSportsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        okezoneSportsViewModel.getOkezoneSports()
        okezoneSportsViewModel.okezoneSports.observe(viewLifecycleOwner) { news ->
            mAdapter.setData(news.data.posts)
            binding.rvOkezoneSports.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }


}
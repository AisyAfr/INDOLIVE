package com.example.indolive.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.indolive.data.model.NewsResponse
import com.example.indolive.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {

    val cnnTerbaru: LiveData<NewsResponse> = repository.cnnTerbaru
    val cnnNasional: LiveData<NewsResponse> = repository.cnnNasional
    val cnnInternasional: LiveData<NewsResponse> = repository.cnnInternasional
    val merdekaTerbaru: LiveData<NewsResponse> = repository.merdekaTerbaru
    val merdekaJakarta: LiveData<NewsResponse> = repository.merdekaJakarta
    val merdekaDunia: LiveData<NewsResponse> = repository.merdekaDunia
    val okezoneTerbaru: LiveData<NewsResponse> = repository.okezoneTerbaru
    val okezoneCelebrity: LiveData<NewsResponse> = repository.okezoneCelebrity
    val okezoneSports: LiveData<NewsResponse> = repository.okezoneSports

    fun getCnnTerbaru() {
        repository.getCnnTerbaru()
    }

    fun getCnnNasional() {
        repository.getCnnNasional()
    }

    fun getCnnInternasional() {
        repository.getCnnInternasional()
    }

    fun getMerdekaTerbaru() {
        repository.getMerdekaTerbaru()
    }

    fun getMerdekaJakarta() {
        repository.getMerdekaJakarta()
    }

    fun getMerdekaDunia() {
        repository.getMerdekaDunia()
    }

    fun getOkezoneTerbaru() {
        repository.getOkezoneTerbaru()
    }

    fun getOkezoneCelebrity() {
        repository.getOkezoneCelebrity()
    }

    fun getOkezoneSports() {
        repository.getOkezoneSports()
    }
}
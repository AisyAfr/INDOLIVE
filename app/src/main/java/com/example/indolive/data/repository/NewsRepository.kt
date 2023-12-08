package com.example.indolive.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.indolive.data.model.NewsResponse
import com.example.indolive.data.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {
    private val _cnnTerbaru = MutableLiveData<NewsResponse>()
    val cnnTerbaru: LiveData<NewsResponse> = _cnnTerbaru

    private val _cnnNasional = MutableLiveData<NewsResponse>()
    val cnnNasional: LiveData<NewsResponse> = _cnnNasional

    private val _cnnInternasional = MutableLiveData<NewsResponse>()
    val cnnInternasional: LiveData<NewsResponse> = _cnnInternasional

    private val _merdekaTerbaru = MutableLiveData<NewsResponse>()
    val merdekaTerbaru: LiveData<NewsResponse> = _merdekaTerbaru

    private val _merdekaJakarta = MutableLiveData<NewsResponse>()
    val merdekaJakarta: LiveData<NewsResponse> = _merdekaJakarta

    private val _merdekaDunia = MutableLiveData<NewsResponse>()
    val merdekaDunia: LiveData<NewsResponse> = _merdekaDunia

    private val _okezoneTerbaru = MutableLiveData<NewsResponse>()
    val okezoneTerbaru: LiveData<NewsResponse> = _okezoneTerbaru

    private val _okezoneCelebrity = MutableLiveData<NewsResponse>()
    val okezoneCelebrity: LiveData<NewsResponse> = _okezoneCelebrity

    private val _okezoneSports = MutableLiveData<NewsResponse>()
    val okezoneSports: LiveData<NewsResponse> = _okezoneSports

    fun getCnnTerbaru(){
        ApiConfig.provideApiService().getCnnTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnnTerbaru.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getCnnNasional(){
        ApiConfig.provideApiService().getCnnNasionalNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnnNasional.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getCnnInternasional(){
        ApiConfig.provideApiService().getCnnInternasionalNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnnInternasional.postValue(response.body())
//                            Log.d("test",response.body().toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getMerdekaTerbaru(){
        ApiConfig.provideApiService().getMerdekaTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _merdekaTerbaru.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getMerdekaJakarta(){
        ApiConfig.provideApiService().getMerdekaJakartaNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _merdekaJakarta.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getMerdekaDunia(){
        ApiConfig.provideApiService().getMerdekaDuniaNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _merdekaDunia.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getOkezoneTerbaru(){
        ApiConfig.provideApiService().getOkezoneTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _okezoneTerbaru.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getOkezoneCelebrity(){
        ApiConfig.provideApiService().getOkezoneCelebrityNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _okezoneCelebrity.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getOkezoneSports(){
        ApiConfig.provideApiService().getOkezoneSportNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _okezoneSports.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

}
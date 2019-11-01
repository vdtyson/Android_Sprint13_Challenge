package com.versilis.sprintproject.data.remote

import com.versilis.sprintproject.data.local.model.Makeup
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface MakeupApiService {

   @GET("/products.json")
    fun getProductsByBrand(@Query("brand") brand: String) : Observable<List<Makeup>>

    companion object Factory {

        fun create(): MakeupApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(MakeupApiConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

           return retrofit.create(MakeupApiService::class.java)
        }
    }
}
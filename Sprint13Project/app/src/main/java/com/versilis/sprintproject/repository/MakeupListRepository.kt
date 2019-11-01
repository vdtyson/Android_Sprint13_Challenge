package com.versilis.sprintproject.repository

import com.versilis.sprintproject.data.remote.MakeupApiService

class MakeupListRepository {

    private val makeupApiService by lazy {
        MakeupApiService.create()
    }

    fun getMakeupProductsByBrand(brandName: String) = makeupApiService.getProductsByBrand(brandName)
}
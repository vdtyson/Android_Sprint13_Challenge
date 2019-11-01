package com.versilis.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.versilis.sprintproject.data.local.model.Makeup
import com.versilis.sprintproject.repository.MakeupListRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MakeupListViewModel(application: Application) : AndroidViewModel(application) {

    private val makeupRepo by lazy {
        MakeupListRepository()
    }
    private val _makeupProducts: MutableLiveData<List<Makeup>> by lazy {
        MutableLiveData<List<Makeup>>()
    }
    val makeupProducts: LiveData<List<Makeup>>
    get() = _makeupProducts

    fun getMakeupProductsByBrand(brandName: String) {
        val disposable = makeupRepo.getMakeupProductsByBrand(brandName).
            subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { makeupProductsByBrand ->
                _makeupProducts.value = makeupProductsByBrand
            }
    }
    override fun onCleared() {

        super.onCleared()
    }
}
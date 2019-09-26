package com.ninis.flexrecyclerview

import androidx.lifecycle.MutableLiveData
import com.ninis.databindingrecyclerview.network.ApiService
import com.ninis.flexrecyclerview.base.BaseViewModel
import com.ninis.flexrecyclerview.data.ResponseModel
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(val service: ApiService) : BaseViewModel() {
    val responseData = MutableLiveData<ResponseModel>()

    fun getData() {
        service.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<ResponseModel> {
                override fun onSuccess(t: ResponseModel) {
                    responseData.value = t
                }

                override fun onSubscribe(d: Disposable) {
                    disposable.add(d)
                }

                override fun onError(e: Throwable) {

                }
            })
    }
}
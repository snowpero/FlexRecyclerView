package com.ninis.flexrecyclerview

import androidx.lifecycle.MutableLiveData
import com.ninis.flexrecyclerview.base.BaseItemModel
import com.ninis.flexrecyclerview.network.ApiService
import com.ninis.flexrecyclerview.base.BaseViewModel
import com.ninis.flexrecyclerview.data.ResponseModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel(val service: ApiService) : BaseViewModel() {
    val responseData = MutableLiveData<ResponseModel>()
    val listItems = MutableLiveData<ArrayList<BaseItemModel>>()

    fun getData() {
        service.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<ResponseModel> {
                override fun onSuccess(t: ResponseModel) {
                    responseData.value = t
                    listItems.value = t.items
                }

                override fun onSubscribe(d: Disposable) {
                    disposable.add(d)
                }

                override fun onError(e: Throwable) {

                }
            })
    }
}
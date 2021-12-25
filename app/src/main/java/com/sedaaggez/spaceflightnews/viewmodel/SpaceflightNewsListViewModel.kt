package com.sedaaggez.spaceflightnews.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sedaaggez.spaceflightnews.model.Article

class SpaceflightNewsListViewModel : ViewModel(){
    val newsList = MutableLiveData<List<Article>>()
    val newsError = MutableLiveData<Boolean>()
    val newsLoading = MutableLiveData<Boolean>()

    fun getData() {
        // TODO: get data
    }
}
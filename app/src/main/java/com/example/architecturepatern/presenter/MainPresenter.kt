package com.example.architecturepatern.presenter

import com.example.architecturepatern.FakeApiService
import com.example.architecturepatern.FakeDataBase
import com.example.architecturepatern.repository.MainRepository
import com.example.architecturepatern.ui.IMainView

class MainPresenter {

    private val api = FakeApiService()
    private val database = FakeDataBase()
    lateinit var view: IMainView
    private val repository = MainRepository()

    fun getUserInfo() {

        val result = repository.getCurrentUser()
        view.onUserInfoSuccess(result)
    }

    fun getAWisdom() {

        val result = repository.getRandomWisdom()
        view.onWisdomSuccess(result)
    }
}
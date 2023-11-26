package com.example.architecturepatern.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.architecturepatern.model.User
import com.example.architecturepatern.model.Wisdom
import com.example.architecturepatern.repository.MainRepository

class MainViewModel : ViewModel() {

    private val repository = MainRepository()
    val currentUser = MutableLiveData<User>()
    val wisdom = MutableLiveData<Wisdom>()
    val name = "Islam Omar"


    fun getUserInfo() {

        currentUser.postValue(repository.getCurrentUser())
        // val result = repository.getCurrentUser()

    }

    fun getAWisdom() {

        wisdom.postValue(repository.getRandomWisdom())
        // val result = repository.getRandomWisdom()

    }
}
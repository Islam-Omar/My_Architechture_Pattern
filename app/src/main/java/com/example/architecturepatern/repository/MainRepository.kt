package com.example.architecturepatern.repository

import com.example.architecturepatern.FakeApiService
import com.example.architecturepatern.FakeDataBase

class MainRepository {

    private val api = FakeApiService()
    private val database = FakeDataBase()

    fun getCurrentUser() = database.getCurrentUser()
    fun getRandomWisdom() = api.getRandomWisdom()
}
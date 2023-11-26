package com.example.architecturepatern
import com.example.architecturepatern.model.User

class FakeDataBase {

    fun getCurrentUser() : User {

        return User("Mohamed Tamer",1996)
    }
}
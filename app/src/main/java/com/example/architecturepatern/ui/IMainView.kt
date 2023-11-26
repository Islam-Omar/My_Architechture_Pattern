package com.example.architecturepatern.ui

import com.example.architecturepatern.model.User
import com.example.architecturepatern.model.Wisdom

interface IMainView {

    fun onUserInfoSuccess(user:User)
    fun onWisdomSuccess (wisdom: Wisdom)
}
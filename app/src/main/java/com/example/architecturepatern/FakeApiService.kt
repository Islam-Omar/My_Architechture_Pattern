package com.example.architecturepatern

import com.example.architecturepatern.model.Wisdom

class FakeApiService {

    private val wisdomList = listOf<Wisdom>(

        Wisdom("ohhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh","25/5/2025"),
        Wisdom("tttttttttttttttttttttttttttttttttttttttttttttt","26/6/2026"),
        Wisdom("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk","27/7/2027"),
        Wisdom("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwh","29/9/2029"),
    )

    fun getRandomWisdom():Wisdom {

        val random = (Math.random() * wisdomList.size).toInt()
        return wisdomList[random]
    }
}
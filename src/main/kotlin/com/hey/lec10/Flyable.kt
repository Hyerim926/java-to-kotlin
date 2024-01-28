package com.hey.lec10

interface Flyable {
    // default 키워드 없이 가능
    fun act() {
        println("파닥 파닥")
    }

    // 추상 메서드 가능
//    fun fly()

}
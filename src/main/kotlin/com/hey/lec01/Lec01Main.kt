package com.hey.lec01

fun main() {
    // 가변 변수 variable의 약자
    var number1: Long = 10L // (1)

    // 불변 변수 value의 약자
    val number2 = 10L // (2)

    var number3: Long? = 1_000L // (3)
    number3 = null

    var person = Person("최태현")
}
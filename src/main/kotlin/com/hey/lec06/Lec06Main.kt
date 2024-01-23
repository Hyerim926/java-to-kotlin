package com.hey.lec06

class Lec06Main {
    fun main() {
        // 컬렉션을 선언하는 방법이 자바와 다름
        val numbers = listOf(1L, 2L, 3L)
        for (number in numbers) {
            println(number)
        }

        // 전통적 for문 - 오름차순
        for (i in 1..3) {
            println(i)
        }

        // 전통적 for문 - 내림차순
        for (i in 3 downTo 1) {
            println(i)
        }

        // i가 2씩 증가할 때
        for (i in 1..5 step 2) {
            println(i)
        }

        // while문
        var i = 1; // i는 가변값이므로 var로 선언
        while (i <= 3) {
            println(i)
            i++
        }
    }
}
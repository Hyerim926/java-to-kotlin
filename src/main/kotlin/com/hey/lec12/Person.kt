package com.hey.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    // 코틀린에는 static이 없다 대신 companion object를 사용한다
    companion object Factory : Log {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory입니다")
        }
    }
}

object Singleton {
    var a: Int = 10
}
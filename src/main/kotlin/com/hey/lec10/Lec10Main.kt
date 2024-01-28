package com.hey.lec10

fun main() {
    Derived(300)
}

open class Base(open val number: Int = 1000) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(override val number: Int) : Base(number) {
    init {
        println("Derived Class")
    }
}

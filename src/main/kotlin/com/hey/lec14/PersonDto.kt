package com.hey.lec14

fun main() {
    val dto1 = PersonDto("hey", 100)
    val dto2 = PersonDto("hey", 200)

    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int
) {}
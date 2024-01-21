package com.hey.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong() // toLong()을 사용하지 않으면 에러 발생
}

fun typeNull() {
    // nullable 변수 처리하기
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L // 최종결과가 long타입이 될 수 있도록
}

// instanceof 다루기
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
    if (obj !is Person) {
        val person = obj as Person
        println(person.age)
    }
}

// instanceof로 null 다루기
fun printAgeIfPersonWithNull(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

// nothing 타입
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun templateLiteral() {
    val person = Person("hey", 20)
    // java
    System.out.println(String.format("이름: %s", person.name))

    // kotlin
    println("이름: ${person.name}")
}

// 문자열 이어붙이기
fun stringConcat() {
    val name = "hey"
    val str =
        """
        ABC
        abc
        ${name}
    """.trimIndent()
}

// 문자열 인덱스로 가져오기
fun stringIndexing() {
    val str = "ABCDE"
    val ch = str[1]
}
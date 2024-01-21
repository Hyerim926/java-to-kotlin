package com.hey.lec02

import com.hey.lec02.Person

fun main() {
    val str: String? = "ABC"
    println(str?.length ?: 0) // str.length가 null이면 0을 print

    println(startsWith("A")) // null이 아님을 단언할 때

    val person = Person("공부하는 개발자")
    startsWithA(person.name) // 자바 메서드에 nullable 어노테이션이 있으면 에러
}

// str과 반환값 모두 null 허용 x
fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

// str null 허용
fun startsWithA1(str: String?): Boolean { // ?로 Nullable 명시
    // As
/*
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
*/
    // Is
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}

// str과 반환값 모두 null 허용
fun startsWithA2(str: String?): Boolean? { // 반환값이 null이 될 수도 있음을 명시
    // As
/*
    if (str == null) {
        return null
    }
    return str.startsWith("A")
*/
    // Is
    return str?.startsWith("A") // safe call은 null이라면 null 반환
}

// str null 허용
fun startsWithA3(str: String?): Boolean {
    // As
/*
    if (str == null) {
        return false
    }
    return str.startsWith("A")
*/
    // Is
    return str?.startsWith("A") ?: false
}

// ?를 붙여 호출하여 null 자동 체크
fun startsWithA4(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
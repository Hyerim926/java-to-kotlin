package com.hey.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) { // 비교연산자를 사용하면 compareTo를 사용한다
        println("Money1이 Money2보다 금액이 큽니다")
    }

    // lazy 연산 수행
    if (lazyFun1() || lazyFun2()) { // lazyFun1이 true이면 lazyFun2를 실행하지 않음
        println("true")
    }

    overLoading()
}

// 동등성과 동일성
fun identityEquality() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 == money3) // true 값만 비교
    println(money1 === money3) // false 주소까지 비교
}

fun lazyFun1(): Boolean {
    println("lazyFun1")
    return true
}

fun lazyFun2(): Boolean {
    println("lazyFun2")
    return false
}

fun overLoading() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(1_000L)
    println(money1 + money2)
}

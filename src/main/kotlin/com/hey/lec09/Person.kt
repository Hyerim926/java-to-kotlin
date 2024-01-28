package com.hey.lec09

fun main() {
}
class Person(
    val name: String = "홍길동", // 주생성자: primary constructor
    var age: Int = 1
) {
    // 대문자로 변경해주는 get()
    /*
        // 첫번째 방법
        val name: String = name
            get() = field.uppercase()
    */
    // 두번째 방법
/*
    fun getUppercaseName(): String {
        return this.name.uppercase()
    }
*/

    // 두번째 방법
/*
    val uppercaseName: String
        get() = this.name.uppercase()
*/

    // init{}은 클래스가 초기화되는 시점에 한 번 호출되는 블록
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다");
        }
        println("초기화 블록")
    }

    // 기존 클래스 안에 생성자로 추가, 나이를 한 살로 초기화
    constructor(name: String) : this(name, age = 1) { // 부생성자: secondary constructor
        println("부생성자 1")
    }


    // 주생성자 호출 -> 부생성자 1 호출 -> 부생성자 2 호출
    constructor(): this("홍길동") {
        println("부생성자 2")
    }

    // 함수처럼 만드는 방법
/*
    fun isAdult(): Boolean {
        return this.age >= 20
    }
*/

    // custom getter
    // 직접 정의한 getter를 활용해 프로퍼티처럼 보이게 할 수 있다
    val isAdult: Boolean
        get() = this.age >= 20
}
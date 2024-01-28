package com.hey.lec10

// 추상클래스
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 외부에서 프로퍼티를 오버라이드할 때 무조건 open을 붙여줘야한다
) {
    abstract fun move()
}
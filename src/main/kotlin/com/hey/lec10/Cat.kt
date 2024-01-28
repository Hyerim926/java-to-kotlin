package com.hey.lec10

// 상속 받을 때는 ` : ` 사용
class Cat(species: String) : Animal(species, 4) {

    // override 어노테이션 대신 직접 붙여줌
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어갑니다")
    }
}
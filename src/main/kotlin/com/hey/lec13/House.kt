package com.hey.lec13

fun main() {

}

class House(
    val address: String,
    val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private var area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}
package com.hey.lec14

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        Country.A -> TODO()
    }
}
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    A("A")
}
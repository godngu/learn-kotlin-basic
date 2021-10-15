package chap02

import chap02.Color.*

fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

// c1, c2 순서 상관 없음
// mix(YELLOW, RED) == mix(RED, YELLOW)
fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main() {
    println(getWarmth(GREEN))
    println(mix(RED, YELLOW))
    println(mix(YELLOW, RED))
}
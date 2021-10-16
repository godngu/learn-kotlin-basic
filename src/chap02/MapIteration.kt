package chap02

import java.util.*

fun map() {
    val binaryReps = TreeMap<Char, String>()

    for (letter in 'A'..'F') {
        val binary = Integer.toBinaryString(letter.toInt())
        binaryReps[letter] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun list() {
    var list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex())
        println("$index: $element")
}

fun main() {
    map();
    println("")
    list()
}
package chapter03.strings

import java.lang.StringBuilder

// 확장 프로퍼티
val String.lastChar: Char
    get() = get(length - 1)

// 확장 프로퍼티
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    println(sb.lastChar)
    sb.lastChar = '!'
    println(sb)
}
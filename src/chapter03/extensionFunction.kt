package chapter03.strings

import java.lang.StringBuilder

// 확장 함수
fun String.lastChar(): Char = this.get(this.length - 1)


fun main() {
    println("Kotlin".lastChar())
    //println(123.lastChar())   // 수신 객체 타입(String)이 맞지 않아 오류가 발생한다.
}
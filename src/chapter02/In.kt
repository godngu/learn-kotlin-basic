package chapter02

fun main() {
    println(isLetter('q'))
    println(isNotDigit('x'))
    println(isNotDigit('1'))
    println(recognize('C'))
    println(recognize('#'))
    println("Kotlin" in "Java".."Scala")
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
}

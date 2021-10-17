package chapter03.strings

fun main(args: Array<String>) {
    var strings: List<String> = listOf("one", "two", "three")
    println(strings.last())

    var numbers: Collection<Int> = setOf(1, 2, 3)
    println(numbers.maxOrNull())
    println(numbers.sum())

    vararg(args)
    infix()
    destructuringDeclaration()
}

/**
 * 가변 인자
 */
fun vararg(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}

/**
 * 중위 함수
 * 1 to("one")  // to 메소드를 일반적인 방식으로 호출
 * 2 to "two"   // to 메소드를 중위 호출 방식으로 호출
 */
fun infix() {
    val map = mapOf(1 to("one"), 2 to "two", 7 to "seven")
    println(map.javaClass)
    println(map)
}

/**
 * 구조 분해 선언
 */
fun destructuringDeclaration() {
    val (key, value) = 1 to "one"

    val collection = listOf(1, 2, 3);
    for ((index, element) in collection.withIndex())
        println("$index: $element")
}
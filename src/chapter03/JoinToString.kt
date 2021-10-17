package chapter03

import chapter03.strings.joinToString

fun main() {
    val list = listOf(1, 2, 3)
    println("joinToString1")
    println(joinToString1(list, ";", "(", ")"))
    println(joinToString1(list, separator = ", ", prefix = "(", postfix = ")"))
    println("")
    println("joinToString2")
    println(joinToString2(list))    // default parameter 값 선언
    println(joinToString2(list, prefix = "<", postfix = ">"))   // separator 인자 생략
    println("")
    println("joinToString4")
    println(list.joinToString4("_", "{", "}"))
    println(arrayListOf(1, 2, 3).joinToString4(" "))
    println("")
    println("join")
    println(listOf("one", "two", "three").join("-"))
}

fun <T> joinToString1(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> joinToString2(
    collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""
) = joinToString1(collection, separator, prefix, postfix)

fun <T> joinToString3(
    collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""
) = joinToString(collection, separator, prefix, postfix)

// Collection<T>에 대한 확장 함수 선언
fun <T> Collection<T>.joinToString4(
    separator: String = ", ", prefix: String = "", postfix: String = ""
) = joinToString1(this, separator, prefix, postfix)

// 문자열 컬렉션만 호출할 수 있는 확장 함수 선언
fun Collection<String>.join(separator: String = ", ", prefix: String = "", postfix: String = "") =
    joinToString4(separator, prefix, postfix)
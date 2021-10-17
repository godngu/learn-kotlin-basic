package chapter03

fun main() {
    split()
    parsePath()
}

private fun split() {
    val string = "12.345-6.A"

    // 명시적으로 정규식을 이용한 split
    println(string.split("\\.|-".toRegex()))

    // 문자열 구분자를 이용한 split
    println(string.split(".", "-"))
}

fun parsePath() {
    val path = "/Users/chapter03/test.txt"
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println(path)
    println("Dir: $directory, fullName: $fullName, name: $fileName, ext: $extension")
    println(path.split("/", "."))
}
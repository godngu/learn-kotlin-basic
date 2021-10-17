package chapter02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader) : Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun main() {
    println(readNumber((BufferedReader(StringReader("239")))))
    println(readNumber((BufferedReader(StringReader("not a number")))))
}
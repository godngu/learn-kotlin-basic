package chap02

interface Expr;
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main() {
    // (1 + 2) + 4
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval3(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval2(e.left) + eval2(e.right)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun eval3(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval3(e.left) + eval3(e.right)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr) : Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
package chapter03

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.showOff() = println("View show off")

fun Button.showOff() = println("Button show off")

fun main() {
    val view: View = Button()
    view.click()
    view.showOff()  // View의 확장 함수가 호출된다.
}
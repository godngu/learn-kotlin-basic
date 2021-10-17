package chapter04

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
//        super<Focusable>.showOff()
    }
}

fun main() {
    Button().click()
    Button().showOff()
    println("")
    val clickable : Clickable = Button()
    clickable.click()
    clickable.showOff()
}
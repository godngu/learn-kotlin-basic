package chapter04

/**
 * open: 다른 클래스가 이 클래스를 상속할 수 있다.
 */
open class RichButton : Clickable {
    /**
     * 기본적으로 final, 하위 클래스가 이 메소드를 오버라이드할 수 없다.
     */
    fun disable() {}

    /**
     * open, 하위 클래스에서 이 메소드를 오버라이드해도 된다.
     */
    open fun animate() {}

    /**
     * 인터페이스에서 오버라이드한 메소드, 기본적으로 열려있다.
     * 맨 앞에 final을 붙이면 하위 클래스에서 오버라이드할 수 없다.
     */
    override fun click() {}
}
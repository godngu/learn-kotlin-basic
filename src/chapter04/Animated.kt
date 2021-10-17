package chapter04

/**
 * 추상클래스, 인스턴스를 만들 수 없다.
 */
abstract class Animated {

    /**
     * 추상함수, 구현이 없다, 하위 클래스에서 반드시 오버라이드 해야 한다.
     */
    abstract fun animate()

    open fun stopAnimating() {}

    /**
     * 비추상함수는 기본적으로 final
     */
    fun animateTwice() {}
}
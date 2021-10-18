package chapter04

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")

    /**
     * protected 멤버는 오직 어떤 클래스나 그 클래스를 상속한 클래스 안에서만 보인다.
     */
    protected fun whisper() = println("Let's talk!")
}

/**
 * 컴파일 오류를 없애려면
 * giveSpeech 확장 함수의 가시성을 internal로 변경하거나,
 * TalkativeButton을 public으로 변경해야 한다.
 */
//fun TalkativeButton.giveSpeech() {
//}
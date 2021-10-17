package chapter03

fun main() {
    try {
        saveUser(User(1, "", ""))
    } catch (e: java.lang.IllegalArgumentException) {
        e.printStackTrace()
    }

    try {
        saveUser2(User(2, "kil", ""))
    } catch (e: java.lang.IllegalArgumentException) {
        e.printStackTrace()
    }
}

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    // 로컬 함수 선언
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }
    validate(user, user.name, "이름")
    validate(user, user.address, "주소")
}

/**
 * 검증 로직을 확장 함수로 추출하기
 */
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${id}: empty $fieldName"
            )
        }
    }
    validate(name, "이름")
    validate(address, "주소")
}

fun saveUser2(user: User) {
    user.validateBeforeSave()
}
fun main() {
    // 1. 简单的 when 表达式
    println("1. 简单的 when 表达式")
    val x = 2

    when (x) {
        1 -> println("x 是 1")
        2 -> println("x 是 2")
        3 -> println("x 是 3")
        else -> println("x 不是 1, 2 或 3")
    }

    // 2. when 作为表达式
    println("\n2. when 作为表达式")
    val result = when (x) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "unknown"
    }
    println("x 是 $result")

    // 3. 处理多个分支
    println("\n3. 处理多个分支")
    when (x) {
        0, 1 -> println("x 是 0 或 1")
        else -> println("x 不是 0 或 1")
    }

    // 4. 使用任意表达式作为分支条件
    println("\n4. 使用任意表达式作为分支条件")
    val y = 10
    when (x) {
        y - 8 -> println("x 是 2")  // 10 - 8 == 2
        else -> println("x 不是 2")
    }

    // 5. 检查类型
    println("\n5. 检查类型")
    fun checkType(obj: Any) {
        when (obj) {
            is String -> println("obj 是一个字符串，长度为 ${obj.length}")
            is Int -> println("obj 是一个整数，值为 $obj")
            else -> println("obj 是其他类型")
        }
    }

    checkType("Hello")
    checkType(123)
}
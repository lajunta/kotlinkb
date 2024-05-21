fun main() {
    // 1. 基本 If 语句
    println("1. 基本 If 语句")
    val a = 10
    val b = 20

    if (a > b) {
        println("a 大于 b")
    } else {
        println("a 不大于 b")
    }

    // 2. If 表达式
    println("\n2. If 表达式")
    val max = if (a > b) {
        a
    } else {
        b
    }
    println("最大值是 $max")

    // 3. If-Else If-Else 梯子
    println("\n3. If-Else If-Else 梯子")
    val number = -10

    val result = if (number > 0) {
        "正数"
    } else if (number < 0) {
        "负数"
    } else {
        "零"
    }

    println("这个数是 $result")

    // 4. 单行 If 表达式
    println("\n4. 单行 If 表达式")
    val min = if (a < b) a else b
    println("最小值是 $min")

    // 5. If 表达式处理可空类型
    println("\n5. If 表达式处理可空类型")
    val name: String? = null

    val greeting = if (name != null) {
        "你好, $name!"
    } else {
        "你好, 陌生人!"
    }

    println(greeting)

    // 6. 函数中的 If 表达式
    println("\n6. 函数中的 If 表达式")
    fun getAbsoluteValue(num: Int): Int {
        return if (num < 0) -num else num
    }

    println("绝对值 -5 是 ${getAbsoluteValue(-5)}")
}

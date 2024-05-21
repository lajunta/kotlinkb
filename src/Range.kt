fun main() {
    // 整型范围
    println("整型范围示例：")
    val intRange = 1..10
    for (i in intRange) {
        println(i)  // 打印从 1 到 10 的数字
    }

    println("\n使用 rangeTo 创建整型范围：")
    val intRangeTo = 1.rangeTo(10)
    for (i in intRangeTo) {
        println(i)  // 打印从 1 到 10 的数字
    }

    println("\n使用 downTo 创建整型范围：")
    val downRange = 10 downTo 1
    for (i in downRange) {
        println(i)  // 打印从 10 到 1 的数字
    }

    println("\n使用 step 创建整型范围：")
    val stepRange = 1..10 step 2
    for (i in stepRange) {
        println(i)  // 打印 1, 3, 5, 7, 9
    }

    // 字符范围
    println("\n字符范围示例：")
    val charRange = 'a'..'z'
    for (ch in charRange) {
        println(ch)  // 打印从 'a' 到 'z' 的字符
    }

    println("\n使用 rangeTo 创建字符范围：")
    val charRangeTo = 'a'.rangeTo('z')
    for (ch in charRangeTo) {
        println(ch)  // 打印从 'a' 到 'z' 的字符
    }

    println("\n使用 downTo 创建字符范围：")
    val charDownRange = 'z' downTo 'a'
    for (ch in charDownRange) {
        println(ch)  // 打印从 'z' 到 'a' 的字符
    }

    println("\n使用 step 创建字符范围：")
    val charStepRange = 'a'..'z' step 2
    for (ch in charStepRange) {
        println(ch)  // 打印 'a', 'c', 'e', ..., 'y'
    }

    // 长整型范围
    println("\n长整型范围示例：")
    val longRange = 1L..10L
    for (l in longRange) {
        println(l)  // 打印从 1 到 10 的长整型数字
    }

    println("\n使用 rangeTo 创建长整型范围：")
    val longRangeTo = 1L.rangeTo(10L)
    for (l in longRangeTo) {
        println(l)  // 打印从 1 到 10 的长整型数字
    }

    println("\n使用 downTo 创建长整型范围：")
    val longDownRange = 10L downTo 1L
    for (l in longDownRange) {
        println(l)  // 打印从 10 到 1 的长整型数字
    }

    println("\n使用 step 创建长整型范围：")
    val longStepRange = 1L..10L step 2
    for (l in longStepRange) {
        println(l)  // 打印 1, 3, 5, 7, 9
    }

    // 范围函数
    println("\n范围函数示例：")
    val range = 1..10
    println("5 in range: ${5 in range}")  // true
    println("15 in range: ${15 in range}") // false

    val reversedRange = range.reversed()
    println("\n反转范围：")
    for (i in reversedRange) {
        println(i)  // 打印从 10 到 1 的数字
    }

    // 与集合配合使用的范围
    println("\n与集合配合使用的范围示例：")
    val list = listOf("a", "b", "c")
    println("\n迭代列表索引：")
    for (i in 0..list.lastIndex) {
        println(list[i])  // 打印 "a", "b", "c"
    }

    println("\n使用 until 创建不包括结束值的范围：")
    for (i in 0 until list.size) {
        println(list[i])  // 打印 "a", "b", "c"
    }
}

//
//此文件展示了如何在 Kotlin 中创建和使用各种范围，包括整数、字符和长整数范围，以及如何使用 `rangeTo`、`downTo` 和 `step` 函数来定义范围。此外，它还展示了如何在集合中使用范围以及如何使用范围函数如 `contains` 和 `reversed`。
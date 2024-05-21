fun main() {
    // 1. 对范围进行遍历
    println("1. 对范围进行遍历")
    for (i in 1..5) {
        println("范围值: $i")
    }

    // 2. 对列表进行遍历
    println("\n2. 对列表进行遍历")
    val fruits = listOf("Apple", "Banana", "Cherry")
    "hello".length
    for (fruit in fruits) {
        println("水果: $fruit")
    }

    // 3. 对数组进行循环遍历
    println("\n3. 对数组进行循环遍历")
    val numbers = arrayOf(10, 20, 30, 40, 50)
    for (number in numbers) {
        println("数组值: $number")
    }

    // 4. 使用索引号进行遍历
    println("\n4. 使用索引号进行遍历")
    for (i in fruits.indices) {
        println("水果 $i: ${fruits[i]}")
    }

    // 5. 使用 withIndex() 函数
    println("\n5. 使用函数 withIndex() 进行遍历")
    for ((index, fruit) in fruits.withIndex()) {
        println("水果 $index: $fruit")
    }

    // 6. 使用 break 和 continue 进行控制
    println("\n6. 使用 break 和 continue 进行控制")
    for (number in numbers) {
        if (number == 30) {
            continue // 30时跳过本次循环
        }
        if (number == 40) {
            break // 等于40时，退出整个循环
        }
        println("控制输出的值: $number")
    }

    // 7. 使用 step 对范围在遍历时进行调整
    println("\n7. 使用 step 对范围在遍历时进行调整")
    for (i in 1..10 step 2) {
        println("步长值 : $i")
    }

    // 8. 使用 downTo 相反顺序输出
    println("\n8. 使用 downTo 相反顺序输出")
    for (i in 10 downTo 1) {
        println("反序值: $i")
    }

    // 9. 对字符串进行遍历
    println("\n9. 对字符串进行遍历")
    val text = "Kotlin"
    for (char in text) {
        println("字符: $char")
    }
}

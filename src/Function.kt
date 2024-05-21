fun add(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

fun divide(a: Int, b: Int): Double {
    if (b == 0) {
        throw IllegalArgumentException("除数不能为零")
    }
    return a.toDouble() / b
}

fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun printMessage(message: String) {
    println(message)
}

fun main() {
    // 基本函数使用
    println("加法: ${add(10, 5)}")
    println("减法: ${subtract(10, 5)}")
    println("乘法: ${multiply(10, 5)}")
    println("除法: ${divide(10, 5)}")

    // 带默认参数的函数
    greet()
    greet("Alice")

    // 返回 `Unit` 类型的函数
    printMessage("这是一条信息")

    // 高阶函数示例
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Number): Number {
        return operation(a, b)
    }

    val sum = calculate(10, 5, ::add)
    val difference = calculate(10, 5, ::subtract)
    val product = calculate(10, 5, ::multiply)
    val quotient = calculate(10, 5, ::divide)

    println("和: $sum")
    println("差: $difference")
    println("积: $product")
    println("商: $quotient")
}
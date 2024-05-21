fun main() {
    // 示例 1：基本的 lambda 表达式
    val sum = { x: Int, y: Int -> x + y }
    println("总和：${sum(3, 5)}") // 输出：总和：8

    // 示例 2：带显式参数类型的 lambda
    val multiply = { x:Int, y:Int -> x * y }
    println("乘积：${multiply(4, 6)}") // 输出：乘积：24

    val chu = { x:Int, y:Int -> x / y }
    println("乘积：${multiply(4, 6)}") // 输出：乘积：24

    val jian = { x:Int, y:Int -> x - y }
    println("乘积：${multiply(4, 6)}") // 输出：乘积：24

    // 示例 3：lambda 作为函数参数
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map({ it * it })
    println("平方数：$squaredNumbers") // 输出：平方数：[1, 4, 9, 16, 25]

    // 示例 4：带接收者的 lambda（扩展函数风格）
    val greet: String.() -> Unit = { println("你好，$this!") }
    "世界".greet() // 输出：你好，世界！

    // 示例 5：带多行的 lambda
    val printMessage = {
        val message = "你好，多行 Lambda！"
        println(message)
    }
    printMessage() // 输出：你好，多行 Lambda！

    "abc".length.toString().map { println(it) }

}

fun caozuo(operation: (Int,Int)->Int, x:Int,y:Int) {
    operation(x,y)
}
Kotlin 函数概念
===

在 Kotlin 中，函数是设计用于执行特定任务的可重用代码块。函数使用 `fun` 关键字定义，后跟函数名称、参数括号和用大括号 `{}` 包围的代码块。

### 函数的基本结构
```kotlin
fun functionName(parameter1: Type1, parameter2: Type2): ReturnType {
    // 要执行的代码
    return result
}
```

### 关键点：
1. **fun**: 用于声明函数的关键字。
2. **functionName**: 函数的名称。
3. **parameter1, parameter2, ...**: 参数列表（可选）。每个参数必须有一个名称和类型。
4. **ReturnType**: 函数返回值的类型。如果不返回任何值，返回类型为 `Unit`，可以省略。
5. **Body**: 定义函数执行内容的代码块。

### 函数示例
以下是一个简单的 Kotlin 函数示例：

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
```

在这个示例中：
- 函数名为 `add`。
- 它接收两个类型为 `Int` 的参数，`a` 和 `b`。
- 它返回 `a` 和 `b` 的和，类型为 `Int`。

### 带默认参数的函数
Kotlin 允许为函数参数指定默认值，这使得在调用函数时某些参数变为可选。

```kotlin
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}
```

### 返回 `Unit` 类型的函数
当函数不返回任何有意义的值时，其返回类型为 `Unit`，可以省略。

```kotlin
fun printMessage(message: String) {
    println(message)
}
```

### 单表达式函数
对于仅包含一个表达式的函数，可以使用 `=` 符号来简化函数体。

```kotlin
fun multiply(a: Int, b: Int): Int = a * b
```

### 高阶函数
Kotlin 支持高阶函数，即接受其他函数作为参数或返回它们的函数。

```kotlin
fun higherOrderFunction(operation: (Int, Int) -> Int) {
    val result = operation(3, 4)
    println("The result is $result")
}

fun main() {
    higherOrderFunction(::add) // 传递函数引用
}
```

## 详细使用示例
让我们创建一个更全面的示例，包括各种类型的函数。

### 示例：带有不同操作的计算器
我们将构建一个简单的计算器，可以使用不同的函数执行加法、减法、乘法和除法。

```kotlin
fun add(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

fun divide(a: Int, b: Int): Double {
    if (b == 0) {
        throw IllegalArgumentException("除数不能为零")
    }
    return a.toDouble() / b
}

fun main() {
    println("加法: ${add(10, 5)}")
    println("减法: ${subtract(10, 5)}")
    println("乘法: ${multiply(10, 5)}")
    println("除法: ${divide(10, 5)}")

    // 使用高阶函数
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
```

### 如何运行代码
1. 确保已安装 Kotlin。
2. 将代码保存到名为 `Calculator.kt` 的文件中。
3. 使用 Kotlin 编译器编译并运行代码：
```sh
kotlinc Calculator.kt -include-runtime -d Calculator.jar
java -jar Calculator.jar
```

这将执行 `main` 函数，并显示各种操作的结果。这个示例涵盖了基本函数声明、默认参数、返回 `Unit` 类型的函数和高阶函数，提供了对 Kotlin 函数的全面介绍。
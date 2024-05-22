密封类（sealed class
===

```kotlin

// 定义一个密封类
sealed class Result {
    // 定义密封类的子类
    data class Success(val data: String) : Result()
    data class Error(val exception: Exception) : Result()
    object Loading : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> {
            println("成功: ${result.data}")
        }
        is Result.Error -> {
            println("错误: ${result.exception.message}")
        }
        Result.Loading -> {
            println("加载中...")
        }
    }
}

fun main() {
    val successResult = Result.Success("操作成功")
    val errorResult = Result.Error(Exception("发生了错误"))
    val loadingResult = Result.Loading

    // 处理不同的结果
    handleResult(successResult)  // 输出: 成功: 操作成功
    handleResult(errorResult)    // 输出: 错误: 发生了错误
    handleResult(loadingResult)  // 输出: 加载中...
}
```

### 密封类的特性

1. **受限的类层次结构**：密封类用于表示受限的类层次结构，其子类必须定义在同一个文件中。这样可以确保所有可能的子类都在编译时已知。
2. **更好的类型安全**：使用密封类时，`when` 表达式可以检查所有可能的子类，无需添加 `else` 分支。
3. **简洁的模式匹配**：密封类非常适合用来表示状态、结果等有限集的类型，并且在使用 `when` 表达式进行模式匹配时非常方便。

### 使用示例

#### 定义密封类
```kotlin
// 定义一个密封类来表示网络请求的结果
sealed class NetworkResult {
    data class Success(val data: String) : NetworkResult()
    data class Failure(val error: String) : NetworkResult()
    object Loading : NetworkResult()
}
```

#### 处理密封类的实例
```kotlin
fun handleNetworkResult(result: NetworkResult) {
    when (result) {
        is NetworkResult.Success -> {
            println("请求成功: ${result.data}")
        }
        is NetworkResult.Failure -> {
            println("请求失败: ${result.error}")
        }
        NetworkResult.Loading -> {
            println("请求中...")
        }
    }
}

fun main() {
    val success = NetworkResult.Success("数据加载成功")
    val failure = NetworkResult.Failure("网络错误")
    val loading = NetworkResult.Loading

    handleNetworkResult(success)  // 输出: 请求成功: 数据加载成功
    handleNetworkResult(failure)  // 输出: 请求失败: 网络错误
    handleNetworkResult(loading)  // 输出: 请求中...
}
```

### 深入理解密封类

#### 密封类的子类
密封类的所有直接子类必须与密封类声明在同一个文件中，但子类本身可以包含嵌套类和对象。

```kotlin
sealed class Operation {
    data class Add(val x: Int, val y: Int) : Operation()
    data class Subtract(val x: Int, val y: Int) : Operation()
    data class Multiply(val x: Int, val y: Int) : Operation()
    data class Divide(val x: Int, val y: Int) : Operation()
}

fun executeOperation(operation: Operation): Int {
    return when (operation) {
        is Operation.Add -> operation.x + operation.y
        is Operation.Subtract -> operation.x - operation.y
        is Operation.Multiply -> operation.x * operation.y
        is Operation.Divide -> operation.x / operation.y
    }
}

fun main() {
    val addition = Operation.Add(4, 2)
    val subtraction = Operation.Subtract(4, 2)
    val multiplication = Operation.Multiply(4, 2)
    val division = Operation.Divide(4, 2)

    println("加法结果: ${executeOperation(addition)}")         // 输出: 加法结果: 6
    println("减法结果: ${executeOperation(subtraction)}")     // 输出: 减法结果: 2
    println("乘法结果: ${executeOperation(multiplication)}") // 输出: 乘法结果: 8
    println("除法结果: ${executeOperation(division)}")       // 输出: 除法结果: 2
}
```

### 总结

密封类在 Kotlin 中非常有用，特别是当你需要表示一个受限的类层次结构时。它们可以帮助你确保在处理所有可能的子类时不遗漏任何情况，从而提高代码的安全性和可读性。在模式匹配中使用密封类，可以使代码更加简洁和易于维护。
 Kotlin `when` 表达式及其使用
 ===

Kotlin 的 `when` 表达式是一种强大的控制结构，类似于其他语言中的 `switch` 语句，但功能更强大和灵活。它不仅可以用于匹配常量，还可以用于任意表达式和复杂的条件。

### 基本用法

#### 简单的 `when` 表达式

最基本的 `when` 用法是匹配常量值：

```kotlin
val x = 2

when (x) {
    1 -> println("x 是 1")
    2 -> println("x 是 2")
    3 -> println("x 是 3")
    else -> println("x 不是 1, 2 或 3")
}
```

#### `when` 作为表达式

`when` 也是一个表达式，因此可以返回一个值：

```kotlin
val result = when (x) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    else -> "unknown"
}
println("x 是 $result")
```

#### 处理多个分支

一个分支可以处理多个值：

```kotlin
when (x) {
    0, 1 -> println("x 是 0 或 1")
    else -> println("x 不是 0 或 1")
}
```

#### 使用任意表达式作为分支条件

`when` 可以使用任意表达式作为分支条件：

```kotlin
val y = 10
when (x) {
    y - 8 -> println("x 是 2")  // 10 - 8 == 2
    else -> println("x 不是 2")
}
```

#### 检查类型

`when` 可以用于类型检查：

```kotlin
fun checkType(obj: Any) {
    when (obj) {
        is String -> println("obj 是一个字符串，长度为 ${obj.length}")
        is Int -> println("obj 是一个整数，值为 $obj")
        else -> println("obj 是其他类型")
    }
}

checkType("Hello")
checkType(123)
```
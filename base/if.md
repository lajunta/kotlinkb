IF 语句还是表达式
===

### Kotlin `if` 表达式及其使用

在 Kotlin 中，`if` 不仅仅是一个语句，它也是一个表达式，这意味着它可以返回一个值。与一些其他语言中的传统 `if` 语句相比，这使得它在更多的场景中更加灵活和有用。

### 基本用法

#### If 语句

Kotlin 中的基本 `if` 语句与其他语言类似：

```kotlin
val a = 10
val b = 20

if (a > b) {
    println("a 大于 b")
} else {
    println("a 不大于 b")
}
```

#### If 表达式

由于 `if` 是一个表达式，它可以**返回一个值**并**赋值**给一个变量：

```kotlin
val max = if (a > b) {
    a
} else {
    b
}
println("最大值是 $max")
```

### If-Else 多个条件判断 

你可以使用 `else if` 链接多个条件：

```kotlin
val number = -10

val result = if (number > 0) {
    "正数"
} else if (number < 0) {
    "负数"
} else {
    "零"
}

println("这个数是 $result")
```

### 单行 If 表达式

对于简单的条件，你可以使用单行 `if` 表达式：

```kotlin
val a = 10
val b = 20

val min = if (a < b) a else b
println("最小值是 $min")
```

### 使用 If 表达式处理可空类型

`if` 表达式在处理可空类型时也非常方便：

```kotlin
val name: String? = null

val greeting = if (name != null) {
    "你好, $name!"
} else {
    "你好, 陌生人!"
}

println(greeting)
```
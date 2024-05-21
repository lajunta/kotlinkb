Kotln Lambda
===

科特林 (Kotlin) 的 Lambda表达式，又称匿名函数，是一种简洁的方式来定义函数。它们可以作为值传递，并能在许多场景下代替传统函数的定义。

**Lambda 表达式的基本语法如下：**

```kotlin
{ 参数列表 -> 函数体 }
```

* `参数列表` (可选): 指定函数接受的输入参数，用逗号分隔。
* `->` 符号: 将参数列表和函数体分开。
* `函数体`: 包含函数要执行的代码，可以是单个表达式或代码块。

**Lambda 表达式的一些特性：**

* **类型推断:** 科特林支持类型推断，可以根据上下文自动推导 Lambda 表达式的返回类型。
* **简洁:** 省去了使用传统函数定义的 `fun` 关键字和其他形式上的冗余，使得代码更加简洁。
* **作为值传递:** Lambda 表达式可以像其他值一样传递给函数，并存储在变量中。

**下面列举一些 Lambda 表达式的例子：**

**1. 无参数无返回值的 Lambda**

```kotlin
val greet = { println("Hello, world!") }
greet()  // 输出: Hello, world!
```

**2. 有一个参数的 Lambda**

```kotlin
val doubler = { number: Int -> number * 2 }
val result = doubler(5)  // result 为 10
```

**3. 多个参数的 Lambda**

```kotlin
val fullName = { firstName: String, lastName: String -> "$firstName $lastName" }
val name = fullName("Alice", "Bob")  // name 为 "Alice Bob"
```

**4. 使用类型注解**

```kotlin
val sum: (Int, Int) -> Int = { x, y -> x + y }
val total = sum(3, 6)  // total 为 9
```

**5. Lambda 表达式作为函数参数**

```kotlin
fun performOperation(operation: (Int, Int) -> Int, a: Int, b: Int): Int {
  return operation(a, b)
}

val difference = performOperation({ x, y -> x - y }, 10, 4)  // difference 为 6
```

这些例子展示了 Lambda 表达式的基本用法及其在不同场景下的应用。Lambda 表达式可以让你的代码更加简洁易读，并能更灵活地处理数据。
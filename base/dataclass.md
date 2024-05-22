data class
===

```kotlin
// 数据类的使用例子说明

// 定义一个数据类
data class User(
    val id: Int,            // 用户ID
    val name: String,       // 用户名
    val age: Int            // 用户年龄
)

fun main() {
    // 创建数据类实例
    val user1 = User(1, "Alice", 28)
    val user2 = User(2, "Bob", 30)

    // 打印用户信息
    println("用户1: $user1")
    println("用户2: $user2")

    // 数据类的自动生成方法
    // 1. toString() 方法
    println("user1 的字符串表示: $user1")

    // 2. equals() 方法
    val user3 = User(1, "Alice", 28)
    println("user1 是否等于 user3: ${user1 == user3}")

    // 3. hashCode() 方法
    println("user1 的哈希码: ${user1.hashCode()}")
    println("user3 的哈希码: ${user3.hashCode()}")

    // 4. copy() 方法
    val user4 = user1.copy(name = "Charlie")
    println("user4 (由 user1 复制并更改 name): $user4")

    // 5. 解构声明
    val (id, name, age) = user1
    println("用户1的解构结果: id = $id, name = $name, age = $age")

    // 深入理解数据类的特性
    // 数据类必须至少有一个参数
    // 数据类的参数默认是 val 或 var
    // 数据类不能是抽象类、开放类（open）、密封类（sealed）或内部类（inner）
}
```

### 数据类的特性

1. **自动生成常用方法**：数据类会自动生成 `toString()`, `equals()`, `hashCode()`, 和 `copy()` 方法。这些方法在处理对象时非常有用。
2. **主要构造函数**：数据类的主要构造函数必须至少包含一个参数，并且这些参数默认是 `val` 或 `var`。
3. **解构声明**：数据类支持解构声明，这使得我们可以轻松地从对象中提取多个属性值。
4. **限制**：数据类不能是抽象类、开放类（`open`）、密封类（`sealed`）或内部类（`inner`）。

### 使用示例
以下是如何使用数据类的一些具体示例：

```kotlin
fun main() {
    val user1 = User(1, "Alice", 28)
    
    // 使用 copy() 方法创建一个新对象
    val user2 = user1.copy(name = "Bob")
    println(user2)  // 输出: User(id=1, name=Bob, age=28)

    // 使用解构声明
    val (id, name, age) = user1
    println("ID: $id, Name: $name, Age: $age")  // 输出: ID: 1, Name: Alice, Age: 28

    // equals() 方法和 hashCode() 方法
    val user3 = User(1, "Alice", 28)
    println(user1 == user3)  // 输出: true
    println(user1.hashCode() == user3.hashCode())  // 输出: true

    // toString() 方法
    println(user1)  // 输出: User(id=1, name=Alice, age=28)
}
```

以上示例展示了数据类的主要特性和用法。通过这些示例，可以更好地理解数据类在 Kotlin 中的优势和使用场景。
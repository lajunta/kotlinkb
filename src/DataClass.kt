package net.lwqzx.dataclass
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

}

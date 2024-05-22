数据类和封装类
===

在 Kotlin 中，数据类 (data class) 和密封类 (sealed class) 用于表示不同类型的数据和对象，但各有其用途：

**数据类 (data class)**

数据类是用于封装数据的简单类。它通过 `data` 关键字声明，并自动生成一些常用方法，例如：

* `toString`：返回对象的字符串表示。
* `equals`：比较两个对象是否相等。
* `hashCode`：返回对象的哈希值。
* `copy`：创建当前对象的副本，可以修改部分属性值。

数据类非常适合用来存储不可变的属性集合，例如用户信息、订单信息等。

**示例代码：**

```kotlin
data class User(val id: Int, val name: String, val age: Int)

fun main() {
  val user1 = User(1, "Alice", 30)
  println(user1) // 输出 User(id=1, name=Alice, age=30)

  val user2 = user1.copy(age = 31)  // 创建副本并修改 age 值
  println(user2) // 输出 User(id=1, name=Alice, age=31)
}
```

**密封类 (sealed class)**

密封类用于定义一组封闭的、已知的所有子类。它通过 `sealed` 关键字声明，其所有直接子类必须定义在同一个文件中。密封类常用于表示一组可能的 حالات (state) ，例如处理 UI 事件、网络请求结果等。

**示例代码：**

```kotlin
sealed class Result {
  data class Success(val data: String) : Result()
  data class Error(val message: String) : Result()
}

fun fetchData(): Result {
  // 模拟网络请求
  val isSuccess = Math.random() > 0.5
  return if (isSuccess) {
    Result.Success("成功获取数据")
  } else {
    Result.Error("网络错误")
  }
}

fun main() {
  val result = fetchData()
  when (result) {
    is Result.Success -> println(result.data)
    is Result.Error -> println(result.message)
  }
}
```

**要点对比**

| 特点           | 数据类 (data class) | 密封类 (sealed class) |
|----------------|--------------------|-----------------------|
| 用途           | 封装数据           | 表示一组可能的 حالات  |
| 关键字         | `data`              | `sealed`              |
| 子类           | 不可再继承          | 必须定义在同一文件中  |
| 自动生成的方法 | `toString`, `equals`, `hashCode`, `copy` | 无                     |


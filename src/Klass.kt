// 声明类
class Person(val name: String, var age: Int) {
    // 属性
    var email: String = ""
    var address: String? = null

    // 次要构造函数
    constructor(name: String, age: Int, email: String) : this(name, age) {
        this.email = email
    }

    // 次要构造函数
    constructor(name: String, age: Int, email: String, address: String) : this(name, age, email) {
        this.address = address
    }

    // 方法
    fun speak() {
        println("$name 说：你好！")
    }

    fun introduce() {
        println("我叫$name，今年$age 岁。")
        if (email.isNotEmpty()) {
            println("我的邮箱是$email。")
        }
        if (address != null) {
            println("我的地址是$address。")
        }
    }
}

fun main() {
    // 创建对象
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob", 25, "bob@example.com")
    val person3 = Person("Charlie", 35, "charlie@example.com", "123 Main St")

    // 访问属性和调用方法
    person1.speak()
    person1.introduce()
    println()
    person2.speak()
    person2.introduce()
    println()
    person3.speak()
    person3.introduce()
}

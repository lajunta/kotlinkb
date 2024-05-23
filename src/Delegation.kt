package net.lwqzx.delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// 定义一个接口
interface Base {
    fun printMessage()
    fun printMessageLine(message: String)
}

// 实现接口的类
class BaseImpl(val x: Int) : Base {
    override fun printMessage() {
        println("BaseImpl 中的 x 值是：$x")
    }

    override fun printMessageLine(message: String) {
        println("BaseImpl 打印信息：$message")
    }
}

// 将接口实现委托给 BaseImpl
class Derived(b: Base) : Base by b

// 属性委托示例
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 '${property.name}' 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 '${property.name}' 属性被设置成了 '$value'")
    }
}

class Example {
    var p: String by Delegate()
}

// lazy 委托示例
class LazyExample {
    val lazyValue: String by lazy {
        println("计算 lazyValue 的值")
        "Hello, Kotlin!"
    }
}

// observable 委托示例
class User {
    var name: String by Delegates.observable("<无名>") {
            prop, old, new ->
        println("属性 ${prop.name} 从 $old 变成了 $new")
    }
}

fun main() {
    println("=== 类委托示例 ===")
    val b = BaseImpl(10)
    val derived = Derived(b)
    derived.printMessage() // 输出 BaseImpl 中的 x 值是：10
    derived.printMessageLine("Hello, Kotlin!") // 输出 BaseImpl 打印信息：Hello, Kotlin!

    println("\n=== 属性委托示例 ===")
    val e = Example()
    println(e.p) // 输出 Example@hashcode, 这里委托了 'p' 属性
    e.p = "新的值" // 输出 Example@hashcode 的 'p' 属性被设置成了 '新的值'

    println("\n=== lazy 委托示例 ===")
    val lazyExample = LazyExample()
    println(lazyExample.lazyValue) // 输出 计算 lazyValue 的值 然后输出 Hello, Kotlin!
    println(lazyExample.lazyValue) // 仅输出 Hello, Kotlin!

    println("\n=== observable 委托示例 ===")
    val user = User()
    user.name = "Carl" // 输出 属性 name 从 <无名> 变成了 Carl
    user.name = "Michael" // 输出 属性 name 从 Carl 变成了 Michael
}

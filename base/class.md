Kotlin 类概念及其使用
===

在 Kotlin 中，类是一种用于创建对象的蓝图或模板。类定义了对象的属性和方法，使得我们可以创建具有相似行为和状态的多个对象。在这里我们将解释 Kotlin 中类的概念以及如何使用它们。

### 类的基本概念

#### 成员

- **属性（Properties）**：类的特征，用于描述对象的状态。
- **方法（Methods）**：类的行为，定义了对象可以执行的操作。

#### 构造函数

- **主构造函数（Primary Constructor）**：类头部的一部分，用于初始化类的实例。
- **次要构造函数（Secondary Constructor）**：可选的构造函数，可以有一个或多个。

#### 继承

- **父类（Superclass）**：被继承的类。
- **子类（Subclass）**：继承父类的类。

### 类的使用

#### 声明类

使用 `class` 关键字声明类，并在大括号内部定义类的属性和方法：

```kotlin
class Person(val name: String, var age: Int) {
    // 方法
    fun speak() {
        println("$name 说：你好！")
    }
}
```

__构造参数如果有val var 定义就是成员变量__

没有的话就是　构造参数　临时参数

类定义时　如果　有init函数，就会在创建对象时自动运行

#### 创建对象

使用类名加括号创建类的实例：

```kotlin
val person1 = Person("Alice", 30)
```

#### 访问属性和调用方法

通过对象名称加`.`操作符访问属性和调用方法：

```kotlin
println("姓名：${person1.name}, 年龄：${person1.age}")
person1.speak()
```

#### 继承

使用 `:` 符号指定父类，并可以在子类中重写父类的方法：

```kotlin
open class Animal(val name: String)

class Dog(name: String) : Animal(name) {
    fun bark() {
        println("$name 汪汪汪！")
    }
}
```

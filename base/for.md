For 循环
===

在Kotlin语言中,提供了几种对`集合`和`范围` 进行循环操作或者循环执行命令的方式，其中`for`循环是最基本也是最常用的方式. 它的基本用法是这样的：

```kotlin
for(元素 in 集合) {
    对每一元素的操作指令
        ...
}
```

### 对范围的循环

范围是一系列连续的数字或者字符的集合，可以通过`..`操作符来创建范围
或者 `step` `downTo` 函数进行创建

```
Int 最常用的范围类型 比如 1..10
Long 更大的满园     比如 1L..10L
Char 字符范围       比如 'a'..'z'
```

```kotlin
for (i in 1..5) {
    println(i)
}
```

输出
```kotlin
1
2
3
4
5
```

### 对集合进行循环

在kotlin中，数组(array) 列表(list) set map 等都属于集合

下面的例子对列表进行循环

```kotlin
val fruits = listOf("Apple", "Banana", "Cherry")
for (fruit in fruits) {
    println(fruit)
}
```
输出 
```dtd
Apple
Banana
Cherry
```

### 使用集合的索引值进行循环

可使用`withIndex()`函数，或者 `indices`属性获得属性,进行循环

```kotlin
val fruits = listOf("Apple", "Banana", "Cherry")
for (i in fruits.indices) {
    println("水果 $i 是 ${fruits[i]}")
}
```

使用`withIndex()`
```kotlin
val fruits = listOf("Apple", "Banana", "Cherry")

for ((index, fruit) in fruits.withIndex()) {
    println("水果 $index 是 $fruit")
}
```

### 对数组进行循环
和对列表的循环一样

```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
for (number in numbers) {
    println(number)
}
```

### 对循环进行控制
Kotlin提供了一些关键字对循环进行控制，如`break`,`continue`

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

for (number in numbers) {
    if (number == 3) {
        continue // v如果等于3就跳过这一次的循环,进入下一次循环
    }
    if (number == 4) {
        break // 当数字是4时就中止整个For循环,不再执行循环的其它命令
    }
    println(number)
}

```

输出
```kotlin
1
2
```
3被跳过,到4时就退出循环


### 总结
`for`循环可以很方便的对范围 列表 数组 集合进行遍历,也可以用`break` `continue` 进行控制。
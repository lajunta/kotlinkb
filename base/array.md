数组的概念与基本操作
===
数组是同一类型数据的有序集合,不能再添加数据,但可以修改数据

## 创建数组的几种方式

1. 通过 `arrayOf()` 来创建通用数组(可包含各种类型数据)
2. 通过 `intArrayOf()` `doubleArrayOf()` 方式创建基本类型数组
3. 通过 `Array` 构造函数来创建

### 一、通过 `arrayOf()` 来创建

```kotlin
var numbers = arrayOf(1,2,3)
var names = arrayOf("张三","李四")
```

## 二、通过`intArrayOf()` 创建整数数组

```kotlin
var numbers = intArrayOf(1,2,3)
```

### 通过`charArrayOf()` 创建字符数组

```kotlin
var numbers = charArrayOf('A','B','C')
```

### 创建其它基本类型数组的方法
- doubleArrayOf
- floatArrayOf
- booleanArrayOf
- byteArrayOf
- shortArrayOf
- longArrayOf

## 三、通过Array构造函数来创建

```kotlin
var numbers = Array(3){0}
val initArray = Array<String>(5) { x -> (x+1).toString() }
var numbers = Array(5){
    x -> x + 1
}
```

## 四、原生类型数组

如果你的数组包含的是基本数据类型,如 整数，浮点数等，
你可以用原生数组来创建数组

- BooleanArray
- ByteArray
- CharArray
- DoubleArray
- FloatArray
- IntArray
- LongArray
- ShortArray

可以减少一些性能开销

可以用以下二种方式来创建

```kotlin
val numbers = IntArray(5)
val numbers = IntArray(3){
    x -> x + 1
}
```

## 数组取值、修改

```kotlin
val x = numbers[0] // 从数组中取值 
numbers[0] = 1     // 修改数组第一个元素为1
```

## 数组的其它操作

取值与赋值
```kotlin
array.set(0,10)  //设置第一位为10
array.get(0)     //取第一位的值 
array[0] = 10    //赋值
```

循环迭代
```kotlin
array.size       //获得数组的长度
array.forEach { println(it) } //循环迭代
``` 

搜索
```kotlin
array.indexOf(3) //取得元素的位置，没找到为-1
array.contains(3) //数组中是否包含这个元素,返回Boolean
```

变换
```kotlin
val mapArray = array.map { it*3 }
val filterArray = array.filter { it>2 }
```
聚合
```kotlin
val sum = intArray.sum()   //元素求和
val avg = intArray.average() //求平均值 
```
其它有用函数 
```kotlin
val sortedArray = array.sorted()  //数组排序
array.reverse()  //数组逆序
val str = array.joinToString(",") //数组变为字符串，逗号分开
```
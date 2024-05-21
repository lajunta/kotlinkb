Kotlin String(字符串类型)
===

在Kotlin中，字符串不是基本数据类型，它是一个类别

通常，字符串值是双引号（"）中的字符序列：

## 定义字符串
定义单行字符串
```kotlin
val str = "abc 123"
```

多行字符串用 三个双引号 """
```kotlin
val text = """
    for (c in "foo")
        print(c)
"""
```
## 字符串模板

在字符串中可使用变量，需要加 `$`符号
需要表达式运算的要加 `${ }`
```kotlin
println("$s.length is ${s.length}") 
```

## 字符串格式化

可通过`String.format()`进行数据的格式化输出

- `%s` 表示字符串
- `%d` 表示整数 
- `%f` 表示浮点数

```kotlin
val number: String = String.format("%07d",31416) 
println(number)  // 输出 0031416
val floatNumber: String = String.format("%+.4f",3.1415926)
println(floatNumber)  // 输出 +3.1416
```
## 字符串操作

str 是 一个字符串
#### 取字符
```kotlin
val char = str.get(0) // 相当于 str[0]
```

#### 字符串长度
```kotlin
val length = "abcd efg".length
```

#### 子字符串 `substring(startIndex: Int, endIndex: Int)`

参数为 开始索引号， 结束索引号

```kotlin
val str = "hello"
val subStr = str.substring(1, 4)  // "ell"
```

#### 子字符串 `substring(startIndex: Int)`

参数为 开始索引号, 此时会取含此索引号后所有字符

```kotlin
val subStr = str.substring(1)  // "ello"
```

#### 搜索

`indexOf(char: Char)` 返回某个字符的索引号

```kotlin
val index = str.indexOf('e')  // 1
```

`contains(char: Char)` 是否包含某个字符

#### 字符串操作

`plus(other: String)` 字符串拼接
`+` 连接字符串
```kotlin
val newStr = str.plus(" World")  // "Hello World"
val newStr = str + " World"  // "Hello World"
```

`replace(oldChar: Char,newChar: Char)` 用新字符取代旧字符
```kotlin
val replacedStr = str.replace('l', 'r')  // "Herro"
```

`toUpperCase() / toLowerCase()` 转换大小写

#### 去除空格

`trim()` 去除字符串前后空格
`trimStart() / trimEnd()` 去除前 / 后的空格

```kotlin
val trimmedStr = "  Hello  ".trim()  // "Hello"
val trimmedStart = "  Hello  ".trimStart()  // "Hello  "
val trimmedEnd = "  Hello  ".trimEnd()  // "  Hello"

```

#### 字符串分隔为数组

`split(delimiter: String)` 分隔为数组_
```kotlin
val parts = str.split("e")  // ["H", "llo"]

```

#### 列表合并为字符串
joinToString(separator: String) 合并为一个字符串

```kotlin
val words = listOf("Hello", "World")
val joinedStr = words.joinToString(", ")  // "Hello, World"

```

#### 正规表达式

`matches(regex: String)`

```kotlin
val isMatch = str.matches("[A-Za-z]+".toRegex())  // true
```

`replace(regex: Regex, replacement: String)`
替换符合条件的内容为指定的内容

```kotlin
val replacedStr = str.replace("[A-Z]".toRegex(), "*")  // "*ello"
```
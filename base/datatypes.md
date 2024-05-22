Kotlin 基本数据类型详解
===

Kotlin 提供了一系列基本数据类型来存储和操作数据。以下是这些基本数据类型的详细解释和比较表。

### 数字类型

1. **整型（Integer Types）**
   - **Byte**: 8 位，表示范围从 -128 到 127
   - **Short**: 16 位，表示范围从 -32,768 到 32,767
   - **Int**: 32 位，表示范围从 -2^31 到 2^31-1
   - **Long**: 64 位，表示范围从 -2^63 到 2^63-1

2. **浮点型（Floating-Point Types）**
   - **Float**: 32 位，单精度浮点数
   - **Double**: 64 位，双精度浮点数

### 字符类型

- **Char**: 16 位 Unicode 字符

### 布尔类型

- **Boolean**: 表示 `true` 或 `false`

### 字符串类型

- **String**: 字符串，字符的序列

### 数组类型

- **Array**: 存储同一类型元素的数组

## 数字类型详细解释

### Byte

```kotlin
val byteValue: Byte = 127
println(byteValue) // 输出：127
```

### Short

```kotlin
val shortValue: Short = 32767
println(shortValue) // 输出：32767
```

### Int

```kotlin
val intValue: Int = 2147483647
println(intValue) // 输出：2147483647
```

### Long

```kotlin
val longValue: Long = 9223372036854775807L
println(longValue) // 输出：9223372036854775807
```

### Float

```kotlin
val floatValue: Float = 3.14F
println(floatValue) // 输出：3.14
```

### Double

```kotlin
val doubleValue: Double = 3.14
println(doubleValue) // 输出：3.14
```

### Char

```kotlin
val charValue: Char = 'A'
println(charValue) // 输出：A
```

### Boolean

```kotlin
val booleanValue: Boolean = true
println(booleanValue) // 输出：true
```

### String

```kotlin
val stringValue: String = "Hello, Kotlin!"
println(stringValue) // 输出：Hello, Kotlin!
```

### Array

```kotlin
val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
println(intArray.joinToString()) // 输出：1, 2, 3, 4, 5
```

## 各位类型比较表

| 数据类型 | 大小（位） | 最小值 | 最大值 | 默认值 |
|----------|-----------|--------|--------|--------|
| Byte     | 8         | -128   | 127    | 0      |
| Short    | 16        | -32,768| 32,767 | 0      |
| Int      | 32        | -2^31  | 2^31-1 | 0      |
| Long     | 64        | -2^63  | 2^63-1 | 0L     |
| Float    | 32        | 1.4E-45| 3.4E38 | 0.0F   |
| Double   | 64        | 4.9E-324| 1.7E308 | 0.0   |
| Char     | 16        | \u0000 | \uFFFF | \u0000 |
| Boolean  | 1         | false  | true   | false  |
| String   | 不固定     | N/A    | N/A    | ""     |
| Array    | 不固定     | N/A    | N/A    | N/A    |



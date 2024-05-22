fun main() {
    // 整型类型示例
    val byteValue: Byte = 127
    println("Byte 值: $byteValue")

    val shortValue: Short = 32767
    println("Short 值: $shortValue")

    val intValue: Int = 2147483647
    println("Int 值: $intValue")

    val longValue: Long = 9223372036854775807L
    println("Long 值: $longValue")

    // 浮点型类型示例
    val floatValue: Float = 3.14F
    println("Float 值: $floatValue")

    val doubleValue: Double = 3.14
    println("Double 值: $doubleValue")

    // 字符类型示例
    val charValue: Char = 'A'
    println("Char 值: $charValue")

    // 布尔类型示例
    val booleanValue: Boolean = true
    println("Boolean 值: $booleanValue")

    // 字符串类型示例
    val stringValue: String = "Hello, Kotlin!"
    println("String 值: $stringValue")

    // 数组类型示例
    val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Array 值: ${intArray.joinToString()}")

    // 数组类型的另一种声明方式
    val arrayOfInt: IntArray = intArrayOf(6, 7, 8, 9, 10)
    println("IntArray 值: ${arrayOfInt.joinToString()}")
}

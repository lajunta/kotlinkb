fun main() {
    val str = "Hello, Kotlin!"

    // 取字符 修改
    println(str[0])  // 输出: H

    // 长度
    println("Length: ${str.length}")  // 输出: Length: 13

    // 取字字符串
    println(str.substring(0, 5))  // 输出: Hello

    // 搜索
    println("Index of 'o': ${str.indexOf('o')}")  // 输出: Index of 'o': 4

    // 是否包含
    println("Contains 'K': ${str.contains('K')}")  // 输出: Contains 'K': true

    // 字符串拼接
    val newStr = str + " Let's learn."
    println(newStr)  // 输出: Hello, Kotlin! Let's learn.

    // 字符 替换
    println(str.replace('o', 'a'))  // 输出: Hella, Katlin!

    // 大小写黑魆魆
    println(str.toUpperCase())  // 输出: HELLO, KOTLIN!
    println(str.toLowerCase())  // 输出: hello, kotlin!

    // 去除空格
    val spacedStr = "  Hello, Kotlin!  "
    println(spacedStr.trim())  // 输出: Hello, Kotlin!

    // 字符串分隔为 列表
    println(str.split(", "))  // 输出: [Hello, Kotlin!]

    // 列表转换成 字符串
    val words = listOf("Kotlin", "is", "fun")
    println(words.joinToString(" "))  // 输出: Kotlin is fun

    // 正则表达式
    println(str.matches(".*Kotlin.*".toRegex()))  // 输出: true
}

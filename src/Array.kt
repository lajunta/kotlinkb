fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)

    // 取数组值
    println(array[0])  // 输出: 1

    // 修改元素
    array[0] = 10

    // 数组大小长度
    println("Size: ${array.size}")  // 输出: Size: 5

    // 循环迭代 it 指其它每次取出的元素
    array.forEach { println(it) }

    // 搜索
    println("Index of 3: ${array.indexOf(3)}")  // 输出: Index of 3: 2

    // 包含
    println("Contains 3: ${array.contains(3)}")  // 输出: Contains 3: true

    // 转换
    val doubled = array.map { it * 2 }
    println(doubled)  // 输出: [20, 4, 6, 8, 10]

    // 过滤
    val filtered = array.filter { it > 2 }
    println(filtered)  // 输出: [10, 3, 4, 5]

    // 聚合
    val sum = array.sum()
    println("Sum: $sum")  // Output: Sum: 28

    // 排序
    val sorted = array.sorted()
    println(sorted)  // Output: [3, 4, 5, 10, 20]

    // 逆向
    array.reverse()
    println(array.joinToString(", "))  // 输出: 5, 4, 3, 2, 10

    // 合并成为字符串
    val str = array.joinToString(", ")
    println(str)  // 输出: 5, 4, 3, 2, 10
}

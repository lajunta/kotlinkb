fun main() {
    // 1. 基本 while 循环
    println("1. 基本 while 循环")
    var i = 1

    while (i <= 5) {
        println("当前值: $i")
        i++
    }

    // 2. do-while 循环
    println("\n2. do-while 循环")
    var j = 1

    do {
        println("当前值: $j")
        j++
    } while (j <= 5)

    // 3. 使用 break 控制循环
    println("\n3. 使用 break 控制循环")
    var k = 1

    while (k <= 5) {
        if (k == 4) {
            break // 退出循环
        }
        println("当前值: $k")
        k++
    }

    // 4. 使用 continue 控制循环
    println("\n4. 使用 continue 控制循环")
    var m = 1

    while (m <= 5) {
        if (m == 3) {
            m++
            continue // 跳过当前迭代
        }
        println("当前值: $m")
        m++
    }
}
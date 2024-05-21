### Kotlin `while` 语句及其使用

Kotlin 中的 `while` 语句用于在条件为真时重复执行某个代码块。它在循环结构中非常常用，用于处理需要多次重复执行的任务，直到某个条件不再满足为止。

### 基本用法

#### `while` 循环

`while` 循环的基本语法如下：

```kotlin
while (condition) {
    // 循环体
}
```

循环会在每次迭代开始前检查条件。如果条件为真，则执行循环体中的代码。否则，退出循环。

#### 示例

```kotlin
var i = 1

while (i <= 5) {
    println("当前值: $i")
    i++
}
```

在这个例子中，循环从 `i` 等于 1 开始，每次迭代后将 `i` 增加 1，直到 `i` 大于 5 时退出循环。

#### `do-while` 循环

`do-while` 循环类似于 `while` 循环，但它会先执行一次循环体，然后再检查条件。这意味着即使条件一开始就是假的，循环体也至少会执行一次。

```kotlin
var j = 1

do {
    println("当前值: $j")
    j++
} while (j <= 5)
```

### `while` 和 `do-while` 循环的区别

- `while` 循环：先检查条件再执行循环体。如果条件一开始就是假的，循环体将不会执行。
- `do-while` 循环：先执行循环体再检查条件。无论条件是否为真，循环体至少会执行一次。

### 控制循环

在循环中，你可以使用 `break` 和 `continue` 控制循环的执行。

- `break`：立即退出循环。
- `continue`：跳过当前迭代并继续执行下一次迭代。

#### 示例

```kotlin
var k = 1

while (k <= 5) {
    if (k == 3) {
        k++
        continue // 跳过当前迭代
    }
    println("当前值: $k")
    k++
}
```

在这个例子中，当 `k` 等于 3 时，`continue` 跳过当前迭代，继续下一次循环。
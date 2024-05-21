Compose
===

什么是Jetpack Compose

Jetpack Compose 是谷歌为构建安卓应用的用户界面 (UI) 开发的一套现代工具包。它使用 Kotlin 语言，旨在让 UI 开发更加快速简易。以下是 Jetpack Compose 的一些关键特性：

- 声明式 UI: 不需要一步步编写代码构建 UI，而是描述 UI 的最终样态。Jetpack Compose 会自动处理底层实现。
- 基于 Kotlin: 它使用 Kotlin 语言编写代码，与传统的 Java UI 开发相比，Kotlin 代码更加简洁易懂。
- 更少代码: 与传统方法相比，Jetpack Compose 通常能用更少的代码实现相同的 UI 效果。
- 强大工具: Android Studio 提供了内置的工具，可以用来预览和调试 Jetpack Compose 代码。

## Compose 工作方式

1. 使用 @Compose 注解 定义这个函数为UI的构建块
2. 这个函数不能有返回值，要有Modifier做为参数
2. 使用声明式定义布局与外观
3. 使用 @Preview 注解 来预览效果

```kotlin
@Preview
@Composable 
fun Greeting(name: String ,modifier: Modifier){
    Text("hello")
}
```

## Compose 函数命名

- 必须是一个名词: DoneButton()    // 完成按钮
- 不能是一个动作: DrawTextField() // 画一个文件框
- 不能是一个形容词 Bright()  //明亮的
- 不能是一个副词: Outside() //外面
- 可以有一个形容词的名词: RoundIcon()  // 圆形图标


## Compose 修饰符
借助修饰符，您可以修饰或扩充可组合项。您可以使用修饰符来执行以下操作：

- 更改可组合项的大小、布局、行为和外观
- 添加信息，如无障碍标签
- 处理用户输入
- 添加高级互动，如使元素可点击、可滚动、可拖动或可缩放
- 修饰符是标准的 Kotlin 对象。您可以通过调用某个 Modifier 类函数来创建修饰符：

```kotlin
@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Hello,")
        Text(text = name)
    }
}
```

## 修饰符列表

[官网连接](https://developer.android.google.cn/develop/ui/compose/modifiers-list?hl=zh-cn#Actions)

- 位置
- 对齐方式
- 大小
- 边框
- 动画
- 变换
- 填充
- ...

Box 堆叠布局
===

这种布局方式是把容器内的元素从上到下进行堆叠布局，一个在另一个的上面


[官方连接](https://developer.android.google.cn/develop/ui/compose/graphics?hl=zh-cn)

在 Jetpack Compose 中，`Box` 布局允许你将多个子元素叠加在一起。你可以使用 `Box` 布局提供的 `contentAlignment` 参数来控制子元素在 `Box` 内的对齐方式。此外，每个子元素还可以使用 `Modifier.align` 来单独控制其对齐方式。`Alignment` 类提供了多种对齐选项。

### 1. `contentAlignment` (内容对齐)
`contentAlignment` 参数用于指定 `Box` 中所有子元素的默认对齐方式，`Alignment` 提供了一些预定义的对齐选项：

- **TopStart**：子元素在顶部左对齐。
- **TopCenter**：子元素在顶部居中对齐。
- **TopEnd**：子元素在顶部右对齐。
- **CenterStart**：子元素在垂直居中左对齐。
- **Center**：子元素在垂直居中水平居中对齐。
- **CenterEnd**：子元素在垂直居中右对齐。
- **BottomStart**：子元素在底部左对齐。
- **BottomCenter**：子元素在底部居中对齐。
- **BottomEnd**：子元素在底部右对齐。

```kotlin
Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center // 可替换为 TopStart, TopCenter, TopEnd, CenterStart, Center, CenterEnd, BottomStart, BottomCenter, BottomEnd
) {
    // 子元素
}
```

### 2. `Modifier.align` (单独对齐)
每个子元素还可以使用 `Modifier.align` 来单独控制其在 `Box` 内的对齐方式。这可以覆盖 `contentAlignment` 设置。

```kotlin
Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.TopStart
) {
    Text(
        text = "Item 1",
        modifier = Modifier.align(Alignment.Center) // 这个元素将居中对齐
    )
    Text(
        text = "Item 2",
        modifier = Modifier.align(Alignment.BottomEnd) // 这个元素将右下对齐
    )
}
```

### 组合示例
下面是一个使用 `Box` 布局和多种对齐方式的示例：

```kotlin
@Composable
fun BoxAlignmentExample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = "TopStart",
            modifier = Modifier
                .align(Alignment.TopStart)
                .background(Color.Red)
                .padding(8.dp)
        )
        Text(
            text = "Center",
            modifier = Modifier
                .align(Alignment.Center)
                .background(Color.Green)
                .padding(8.dp)
        )
        Text(
            text = "BottomEnd",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(Color.Blue)
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxAlignmentExample() {
    BoxAlignmentExample()
}
```

### 总结
在 Jetpack Compose 中，`Box` 布局通过 `contentAlignment` 参数提供了多种对齐方式，用于控制所有子元素的默认对齐。此外，每个子元素还可以使用 `Modifier.align` 单独控制其对齐方式。通过这些对齐选项，你可以灵活地设计复杂的UI布局，以满足不同的设计需求。
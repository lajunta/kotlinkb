加载图片
===

[官方连接](https://developer.android.google.cn/develop/ui/compose/graphics/images?hl=zh-cn)

## 加载本地图片

```kotlin
Image(
    painter = painterResource(id = R.drawable.dog),
    contentDescription = stringResource(id = R.string.dog_content_description)
)
```

## 加载联网图片

使用 Coil 库，加载网络图片，需要将这个库加入到Gradle依赖中

使用 `AsyncImage`

```kotlin
AsyncImage(
    model = "https://example.com/image.jpg",
    contentDescription = "Translated description of what the image contains"
)
```

## 加载图标

同加载图片一样的方式

使用Material图标,加载一个购物车图标

```kotlin
Icon(
    Icons.Rounded.ShoppingCart,
    contentDescription = stringResource(id = R.string.shopping_cart_content_desc)
)
```

## 自定义图片

使用 contentScale 选项更改图片绽放方式

```kotlin
val imageModifier = Modifier
    .size(150.dp)
    .border(BorderStroke(1.dp, Color.Black))
    .background(Color.Yellow)
Image(
    painter = painterResource(id = R.drawable.dog),
    contentDescription = stringResource(id = R.string.dog_content_description),
    contentScale = ContentScale.Fit,
    modifier = imageModifier
)
```

## contentScale 类型

- ContentScale.Fit
- ContentScale.Crop
- ContentScale.FillHeight
- ContentScale.FillWidth
- ContentScale.FillBounds
- ContentScale.Inside
- ContentScale.None

## 把图片变为正圆形

```kotlin
Image(
    painter = painterResource(id = R.drawable.dog),
    contentDescription = stringResource(id = R.string.dog_content_description),
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .size(200.dp)
        .clip(CircleShape)
)
```

## 图片变为圆角矩形

```kotlin
Image(
    painter = painterResource(id = R.drawable.dog),
    contentDescription = stringResource(id = R.string.dog_content_description),
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .size(200.dp)
        .clip(RoundedCornerShape(16.dp))
)
```

## 图片加边框

```kotlin
val borderWidth = 4.dp
Image(
    painter = painterResource(id = R.drawable.dog),
    contentDescription = stringResource(id = R.string.dog_content_description),
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .size(150.dp)
        .border(
            BorderStroke(borderWidth, Color.Yellow),
            CircleShape
        )
        .padding(borderWidth)
        .clip(CircleShape)
)
```

## 设置宽高比

```kotlin
Image(
    painter = painterResource(id = R.drawable.dog),
    contentDescription = stringResource(id = R.string.dog_content_description),
    modifier = Modifier.aspectRatio(16f / 9f)
)
```

## 图形操作
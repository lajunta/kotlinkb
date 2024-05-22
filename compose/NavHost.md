使用 NavController 和 NavHost 来在 Android 中实现 Compose 之间的跳转，可以帮助你构建具有导航功能的应用程序。以下是详细的中文解释：

### 1. 导入依赖项

确保项目的 `build.gradle` 文件中包含 Navigation Compose 的依赖项。

```groovy
dependencies {
    // Navigation Compose
    implementation "androidx.navigation:navigation-compose:2.4.0-alpha02"
}
```

### 2. 设置导航目的地

在你的应用程序中设置导航目的地，即每个 Compose 页面对应的目的地。

```kotlin
sealed class Screen(val route: String) {
    object Screen1 : Screen("screen1")
    object Screen2 : Screen("screen2")
    object Screen3 : Screen("screen3")
}
```

### 3. 创建 Composable 函数

为每个页面创建一个 Composable 函数，以显示该页面的内容。

```kotlin
@Composable
fun Screen1Content(navController: NavController) {
    // 页面内容
}

@Composable
fun Screen2Content(navController: NavController) {
    // 页面内容
}

@Composable
fun Screen3Content(navController: NavController) {
    // 页面内容
}
```

### 4. 设置 NavHost

在主要的 Composable 函数中设置 NavHost，以确定页面间的导航关系。

```kotlin
@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.Screen1.route) {
        composable(Screen.Screen1.route) {
            Screen1Content(navController)
        }
        composable(Screen.Screen2.route) {
            Screen2Content(navController)
        }
        composable(Screen.Screen3.route) {
            Screen3Content(navController)
        }
    }
}
```

### 5. 执行导航

在需要执行页面跳转的地方，使用 NavController 的 navigate 函数来进行导航。

```kotlin
Button(onClick = { 
    navController.navigate(Screen.Screen2.route) 
}) {
    Text("跳转到页面2")
}
```

### 6. 传递数据

你可以使用 `NavBackStackEntry` 和 `rememberSaveable` 来传递数据给目标页面。

```kotlin
composable(Screen.Screen2.route) { backStackEntry ->
    val data = backStackEntry.arguments?.getString("data")
    Screen2Content(navController, data)
}

// 在跳转时传递数据
Button(onClick = { 
    navController.navigate(Screen.Screen2.route) {
        launchSingleTop = true
        arguments = bundleOf("data" to "Hello from Screen1")
    }
}) {
    Text("跳转到页面2")
}
```

### 总结

使用 NavController 和 NavHost 可以轻松实现 Compose 之间的导航。通过设置导航目的地、创建页面的 Composable 函数、设置 NavHost 和执行导航操作，你可以构建具有良好导航功能的 Android 应用程序，并且可以在页面间传递数据。
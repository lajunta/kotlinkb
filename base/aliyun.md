配置Aliyun镜像
===

修改 ｀settings.gradle.kts｀ 添加阿里云的仓库

```kotlin
pluginManagement {
    repositories {
        maven {
             url = uri("https://maven.aliyun.com/repository/public")
        }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/public")
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "Exec1"
include(":app")


```
将示例依赖项替换为你从阿里云仓库中需要的实际依赖项。
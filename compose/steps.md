新建Android工程
===

## 准备工作

1. 下载 JDK　并正确安装配置JAVA_HOME
2. 下载 GRADLE 并且配置　GRADLE_USER_HOME

## 设置gradle.properties

```text
org.gradle.caching=true                                                                                                   
distributionBase=GRADLE_USER_HOME                                                                                         
distributionPath=wrapper/dists                                                                                            
distributionUrl=file:///opt/gradle-8.6/wrapper/dists/gradle-8.6-bin.zip                                                   
zipStoreBase=GRADLE_USER_HOME                                                                                             
zipStorePath=wrapper/dists    
```

## 设置init.gradle.kts
```kotlin
settingsEvaluated {                                                                                                       
    dependencyResolutionManagement {                                                                                      
       repositories {                                                                                                    
          google()                                                                                                      
          mavenCentral()                                                                                                
                                                                                                                        
          maven {                                                                                                       
             url = uri("https://maven.aliyun.com/repository/public")                                                   
          }                                                                                                             
       }                                                                                                                 
    }                                                                                                                     
} 
```

## 新建Ａndroid项目

1. 停止　gradle　
2. 设置　gradle 文件分发为本地目录
3. 修改｀settings.gradle.kts｀, 在仓库中添加

```kotlin
    repositories {

    maven {
        url = uri("https://maven.aliyun.com/repository/public")
    }

}
```
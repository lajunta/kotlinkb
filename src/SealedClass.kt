sealed class Result {
    // 定义密封类的子类
    data class Success(val data: String) : Result()
    data class Error(val exception: Exception) : Result()
    object Loading : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> {
            println("成功: ${result.data}")
        }
        is Result.Error -> {
            println("错误: ${result.exception.message}")
        }
        Result.Loading -> {
            println("加载中...")
        }
    }
}

fun main() {
    val successResult = Result.Success("操作成功")
    val errorResult = Result.Error(Exception("发生了错误"))
    val loadingResult = Result.Loading

    // 处理不同的结果
    handleResult(successResult)  // 输出: 成功: 操作成功
    handleResult(errorResult)    // 输出: 错误: 发生了错误
    handleResult(loadingResult)  // 输出: 加载中...
}

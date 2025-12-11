package me.autopapers2

fun <T> wrapThrowable(func: () -> T ): ValueOrError<T>{
    try {
        val result = func()
        return ValueOrError.success(result)
    } catch (e: Exception) {
        return ValueOrError.failure(e)
    }
}
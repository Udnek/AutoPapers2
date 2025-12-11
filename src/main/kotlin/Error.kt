package me.autopapers2

class Error(val message: String) {

    fun join(next: Error): Error{
        return join(next.message)
    }

    fun join(next: String): Error{
        return Error("${message}: $next")
    }
}
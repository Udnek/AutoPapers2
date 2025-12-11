package me.autopapers2

class ValueOrError<out T>{

    private val value: T?
    private val error: Error?

    private constructor(value: T?, error: Error?){
        this.value = value
        this.error = error
    }

    companion object{
        fun <T> fail(error: Error): ValueOrError<T>{
            return ValueOrError(null, error)
        }

        fun <T> fail(error: String): ValueOrError<T>{
            return ValueOrError(null, Error(error))
        }

        fun <T> success(value: T): ValueOrError<T> {
            return ValueOrError(value, null)
        }
    }

    operator fun component1(): T? = value

    operator fun component2(): Error? = error

}
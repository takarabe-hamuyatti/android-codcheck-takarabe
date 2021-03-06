package jp.co.yumemi.android.code_check.entity

sealed class Resource<out T> {
    data class Success<T>(val data: T) : Resource<T>()
    data class Failed(val throwable: Throwable) :
        Resource<Nothing>()

    object Empty : Resource<Nothing>()
}

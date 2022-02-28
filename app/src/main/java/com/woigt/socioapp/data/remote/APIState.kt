package com.woigt.socioapp.data.remote

sealed class APIState<out T> {
    data class Success<out T>(val data: T) : APIState<T>()
    data class Error(val error: Throwable) : APIState<Nothing>()
}

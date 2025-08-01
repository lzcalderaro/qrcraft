package com.lzcalderaro.android.core.domain

sealed interface QRCraftResult<out D, out E: Error> {
    data class Success<out D>(val data: D): QRCraftResult<D, Nothing>
    data class Error<out E: com.lzcalderaro.android.core.domain.Error>(val error: E): QRCraftResult<Nothing, E>
}

inline fun <T, E: Error, R> QRCraftResult<T, E>.map(map: (T) -> R): QRCraftResult<R, E> {
    return when(this) {
        is QRCraftResult.Error -> QRCraftResult.Error(error)
        is QRCraftResult.Success -> QRCraftResult.Success(map(data))
    }
}

fun <T, E: Error> QRCraftResult<T, E>.asEmptyDataResult(): EmptyResult<E> {
    return map {  }
}

typealias EmptyResult<E> = QRCraftResult<Unit, E>

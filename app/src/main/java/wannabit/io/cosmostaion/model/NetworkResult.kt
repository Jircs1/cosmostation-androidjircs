package wannabit.io.cosmostaion.model

sealed class NetworkResult<out T> {
    data class Success<out T>(val data: T) : NetworkResult<T>()
    data class Error(
        val errorType: String? = null,
        val errorMessage: String? = null
    ) : NetworkResult<Nothing>()
}
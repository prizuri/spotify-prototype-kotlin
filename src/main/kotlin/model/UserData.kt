package model

data class UserData(
    val id: Int,
    val name: String? = null,
    val username: String? = null,
    val password: String? = null,
    val address: String? = null
)
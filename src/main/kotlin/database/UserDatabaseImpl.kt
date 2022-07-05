package database

import model.UserData

class UserDatabaseImpl : UserDatabase {

    private val userList = mutableListOf(
        UserData(1, "pri", "prizurih", "123", "medan" ),
        UserData(2, "dev", "wxa", "123", "kalimantan"),
        UserData(3, "hahah", "kawi", "123", "sulawesi"),
    )

    override fun findAllUser(): List<UserData> = userList

    override fun findUser(username: String): UserData? =userList.find {
        it.username.equals(username,true)
    }

    override fun registerUser(data: UserData) {
        userList.add(data)
    }
}
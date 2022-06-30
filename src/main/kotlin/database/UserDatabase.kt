package database

import model.UserData

interface UserDatabase {
    fun findAllUser(): List<UserData>

    fun findUser(username:String): UserData?

}
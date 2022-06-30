package database

import model.UserData

class UserDatabaseImpl : UserDatabase {
    private val userList = listOf(
        UserData(1, "Pri", "pri1", "123", "Medan"),
        UserData(2, "im", "im1", "123", "Medan")
    )

    override fun findAllUser(): List<UserData> = userList


    override fun findUser(username:String): UserData? {
//        for (position in 0..userList.size){
//            val selectedUserToCheck = userList[position]
//            if(selectedUserToCheck.username.equals(username, true)){
//                return selectedUserToCheck
//            }
//        }
//        return null
        val selectedUser = userList.forEach{
            if(it.username.equals(username, true)){
                return it
            }
        }
        return selectedUser
    }
}
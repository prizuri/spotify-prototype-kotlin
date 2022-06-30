package features

import java.util.*

class CredentialFeature (val scanner: Scanner) {
    fun login(){
        print("Your username: ")
        val inputUsername=scanner.nextLine()
        print("Your password: ")
        val inputPassword=scanner.nextLine()
    }
    fun getUser(){

    }
}
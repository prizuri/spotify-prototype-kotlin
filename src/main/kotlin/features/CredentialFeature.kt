package features

import service.CredentialService
import service.CredentialServiceImpl
import java.util.*

class CredentialFeature(val scanner: Scanner) {
    private val credentialService: CredentialService = CredentialServiceImpl()
    fun login() {
        print("Your username: ")
        val inputUsername = scanner.nextLine()
        print("Your password: ")
        val inputPassword = scanner.nextLine()
        val loggedInUser = credentialService.doLogin(inputUsername, inputPassword)
        loggedInUser?.let {
            println("Nama: ${loggedInUser.name}")
            println("Username: ${loggedInUser.username}")
            println("Address: ${loggedInUser.address}")
        }
    }

    fun getProfile() {

    }
}

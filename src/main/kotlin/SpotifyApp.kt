import enums.SpotifyMenu
import features.CredentialFeature
import java.util.Scanner

private val scanner = Scanner(System.`in`)
private lateinit var credentialFeature: CredentialFeature
fun main() {
    setup()
    println("Selamat datang di Spotify")
    println("1. Login")
    println("2. View Profile")
    println("Pilih menu: ")
    when (scanner.nextLine()) {
        SpotifyMenu.LOGIN.id -> {
            credentialFeature.login()
        }
        SpotifyMenu.PROFILE.id -> {
            println(SpotifyMenu.PROFILE.message)
        }
        else -> println("Maaf menu yang dipilih tidak ada")
    }
}

fun setup(){
    credentialFeature= CredentialFeature(scanner)
}
import java.util.*

fun main(args: Array<String>) {
    val sken = Scanner(System. `in`)
    print("Waktu Sekarang: ")
    val waktu = sken.nextLine()
    print("Nama Anda: ")
    val nama = sken.nextLine()
    print("Umur Anda: ")
    val umur = sken.nextInt()
    print("Suhu Tubuh Anda: ")
    val suhu = sken.nextDouble()

    println("")

    println("Selamat $waktu, $nama.")
    println("Umur Anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius.")
}

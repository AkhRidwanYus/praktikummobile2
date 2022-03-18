class Pekerjaan(val nama: String, val gaji: Int, val waktu: String){
    fun Ingfo(){
        var mengingfokan = """Nama pekerjaan adalah $nama.
Anda bekerja disini dengan gaji Rp. $gaji. 
Sebagai gantinya kalian harus bekerja $waktu.
        """.trimIndent()
        println("$mengingfokan")
    }
}

fun main(args: Array<String>) {
    val Programmer = Pekerjaan("Programmer", 10000000, "Full-TIme")
    Programmer.Ingfo()
}


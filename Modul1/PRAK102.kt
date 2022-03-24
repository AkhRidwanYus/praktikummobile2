import java.util.*

fun hitung(x: Int){
    var hasil = (2 * (x * x)) + (5 * x) - 8
    println("$hasil")
}

fun main(args: Array<String>) {
    val sken = Scanner(System. `in`)
    print("Nilai x = ")
    hitung(sken.nextInt())
}


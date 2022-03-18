import java.util.*

fun main(args: Array<String>) {
    val sken = Scanner(System. `in`)
    print("Input Bilangan = ")
    val bila = sken.nextInt()
    var hitung = 0
    var ye: Int = 0
    for (i in 1..100){
        ye = bila * i
        if(((ye%2) == 0) or ((ye%3) == 0)){
            print("$ye ")
            hitung += 1
        }
        if (hitung == 5){
            break;
        }
    }
}

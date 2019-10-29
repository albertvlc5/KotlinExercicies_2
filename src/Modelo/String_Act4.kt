package Modelo


fun hastaS(fin: String) {
    for(caracter in fin) {
        print("$caracter  ")
    }
    println()
}

fun Int.hasta(fin: Int) {
        for(valor in this ..fin) {
            print("$valor  ")
        }
        println()
    }






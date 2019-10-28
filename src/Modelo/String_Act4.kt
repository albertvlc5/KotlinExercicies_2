package Modelo

//class String : Comparable<String>, CharSequence

    fun Int.hasta(fin: Int) {
        for(valor in this ..fin) {
            print("$valor  ")
        }
        println()
    }






package Controlador
import Modelo.*

fun main(parametro: Array<String>) {
    println("Introduzca el valor del dado : ")
    var n: Int =readLine()!!.toInt()
    val dadon = Dado(n)

    println(dadon)

}
package Controlador
import Modelo.*

fun main(args: Array<String>) {

    println("Introduzca el valor a empezar (desde): ")
    val desde: Int = readLine()!!.toInt()

    println("Introduzca el ultimo valor de la cadena (hasta) : ")
    val hastanum: Int = readLine()!!.toInt()

    desde.hasta(hastanum)

    println("Introduce una palabra")
    val palabra: String = readLine()!!.toString()

    hastaS(palabra)

}
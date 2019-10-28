package Controlador
import Modelo.*

fun main(parametro: Array<String>) {
    println("Introduzca el nombre de un titular:")
    val nombre: String = readLine()!!.toString()
    println("Digame un monto:")
    var monto1: Double = readLine()!!.toDouble()

    val pruebaAhorros = CajaAhorro(nombre, monto1)
    val pruebaAhorros1 = CajaAhorro("Albert", 5700.73)
    pruebaAhorros.detalles()
    println("------ Pasandole los parametros: ------")
    pruebaAhorros1.detalles()

    println("Introduzca su nombre para contratar un plazo fijo:")
    val nombrePF: String = readLine()!!.toString()
    println("Digame un monto:")
    var montoPF: Double = readLine()!!.toDouble()
    println(" % :")
    var interes: Double = readLine()!!.toDouble()
    println("Plazo de dias :")
    var dias: Int = readLine()!!.toInt()

    val pruebaPfijo = PlazoFijo("Javi", 10000.0, 25.0, 365)
    val pruebaPfijo1 = PlazoFijo(nombrePF,montoPF,interes,dias)
    pruebaPfijo1.detalles()
    println("------ Pasandole los parametros: ------")
    pruebaPfijo.detalles()

}

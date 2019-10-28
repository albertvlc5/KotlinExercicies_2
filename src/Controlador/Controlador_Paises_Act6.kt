package Controlador
import Modelo.*

fun main(parametro: Array<String>) {
    val pais = PaisesSudAmerica.BRASIL
    val pais1 = PaisesSudAmerica.CHILE
    val pais2 = PaisesSudAmerica.URUGUAY
    val pais3 = PaisesSudAmerica.COLOMBIA

    println("El pais $pais tiene ${pais.habitantes} habitantes. ")
    println("El pais $pais1 tiene ${pais1.habitantes} habitantes. ")
    println("El pais $pais2 tiene ${pais2.habitantes} habitantes. ")
    println("El pais $pais3 tiene ${pais3.habitantes} habitantes. ")


}
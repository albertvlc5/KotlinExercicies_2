package Controlador

import Modelo.Electrodomestico

fun main(){
    var e = Electrodomestico()
    println(e)
    var e1= Electrodomestico(250.0,"Blanco","A",5.0)
    println(e1)
    var e2 = Electrodomestico(300.0,15.0)
    println(e2)

    e1.comprobarColor()
    e1.comprobarConsumoElectrico()

}
package Controlador

import Vista.*
import Modelo.*

fun main() {

    var elige: MenuVista_Empresa_Act2 = MenuVista_Empresa_Act2()

    var opcion: String = ""
    var salir = false
    while (!salir) {
        opcion = elige.imprimeMenu().toString()

        when (opcion) {
            "1" -> crearempresa()
            "2" -> Añadirempleado()
            "3" -> Verempresas()
            "4" -> Infoempresa()
            "5" -> Crearempleado()
            "6" -> Verempleados()
            "7" -> Infoempleado()
            "8" -> salir = true
        }
    }

}

val empresas: MutableList<Empresa> = mutableListOf()
val empleados: MutableList<Empleado> = mutableListOf()
fun crearempresa() {
    println("Introduzca el nombre de la empresa : ")
    val nombreEmpresa: String = readLine()!!.toString()
    println("Introduzca el año de fundacion de la empresa : ")
    val añofundacionEmpresa: String = readLine()!!.toString()
    val empresa = Empresa(nombreEmpresa, añofundacionEmpresa)
    empresas.add(empresa)

}

fun Añadirempleado() {
    println("Introduzca el nombre de la empresa a la que quieres añadir al empleado : ")
    val nombreEmpresa: String = readLine()!!.toString()
    println("Introduzca el nombre del empleado : ")
    val nombreEmpleado: String = readLine()!!.toString()

    for ( i in empresas) {
        if( empresas.find{ i.nombre == nombreEmpresa} != null) {
                i.empleados.add(nombreEmpleado)
        }
    }

}


fun Verempresas() {
    println(empresas)

}

fun Infoempresa() {
    println("Introduzca el nombre de la empresa a la que quieres acceder : ")
    var nombreEmpresa: String = readLine()!!.toString()

    for ( i in empresas) {
        if( empresas.find{ i.nombre == nombreEmpresa} != null) {
            println(i)
        }
    }

}

fun Crearempleado() {
    println("Introduzca el nombre del empleado : ")
    val nombreEmpleado: String = readLine()!!.toString()
    println("Introduzca el apellido del empleado :")
    val apellido: String = readLine()!!.toString()
    println("Introduzca su fecha de nacimiento: ")
    val fechanacimiento: String = readLine()!!.toString()
    println("Introduzca la fecha de contrato :")
    val fechacontrato: String = readLine()!!.toString()
    val empleado = Empleado(nombreEmpleado,apellido,fechanacimiento,fechacontrato)
    empleados.add(empleado)

}

fun Verempleados() {

    println(empleados)

}

fun Infoempleado() {
    println("Introduzca el nombre del empleado : ")
    val nombreEmpleado: String = readLine()!!.toString()

    for ( i in empleados) {
        if( empleados.find{ i.nombre == nombreEmpleado} != null) {
            println(i)
        }
    }

}







package Controlador
import Vista.*
import Modelo.*

fun main (){
    var elige: MenuVista_Cuenta_Act1 = MenuVista_Cuenta_Act1()
    var cuenta: Cuenta_Act1 = Cuenta_Act1()
    var opcion: String =""
    var salir =false
    while(!salir) {
        opcion = elige.imprimeMenu().toString()

        when (opcion) {
            "1" -> ConsultarSaldo(cuenta, elige)
            "2" -> Ingresar(cuenta, elige)
            "3" -> RetirarDinero(cuenta, elige)
            "4" -> salir=true
        }
    }
}

fun ConsultarSaldo(cuenta:Cuenta_Act1, elige:MenuVista_Cuenta_Act1) {

//    println("Mi saldo es " + cuenta.saldo)
        elige.getBalance(cuenta.saldo)
}
fun Ingresar(cuenta:Cuenta_Act1, elige:MenuVista_Cuenta_Act1) {
   var ingresado:Double= elige.ingresar()
    cuenta.saldo+=ingresado

}
fun RetirarDinero(cuenta:Cuenta_Act1, elige:MenuVista_Cuenta_Act1) {
    var retirado:Double=elige.retirar()
    cuenta.saldo-=retirado

    /*println("He retirado")
    var dineroARetirar: Double =readLine()!!.toDouble()
    cuenta.saldo-=dineroARetirar*/
}

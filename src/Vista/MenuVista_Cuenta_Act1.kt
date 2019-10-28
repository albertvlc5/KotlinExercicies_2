package Vista
class MenuVista_Cuenta_Act1 () {
    fun imprimeMenu(): String? {
            println("Operaciones en el Banco")
            println("------------------------")
            println("1. -Consultar saldo ")
            println("2. -Ingresar")
            println("3. -Retirar dinero")
            println("4. -Salir")
            println("Eliga la operación a realizar :")
            var opcion  =readLine()
        return opcion
    }

    fun getBalance(saldo: Double) {
        println("Mi saldo es " +saldo )
    }

    fun ingresar(): Double {
        println("Introduzca el dinero a ingresar : ")
        var dineroAIngresar: Double =readLine()!!.toDouble()

        return dineroAIngresar
    }

    fun retirar(): Double {
        println("Introduzca el dinero a retirar : ")

        var dineroARetirar: Double = readLine()!!.toDouble()

        return dineroARetirar
    }
}

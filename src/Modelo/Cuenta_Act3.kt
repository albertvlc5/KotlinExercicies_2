package Modelo

abstract class Cuenta(val nombretitular: String, val monto: Double) {
    open fun detalles() {
        println("El nombre del titular es: $nombretitular ")
        println("El monto de su cuenta es: $monto ")
    }
}

class CajaAhorro(nombretitular: String, monto: Double): Cuenta(nombretitular, monto) {
    override fun detalles() {
        println("Esta en una caja de ahorros ")
        super.detalles()
    }
}

class PlazoFijo(nombretitular: String, monto: Double, val interes: Double, val dias: Int): Cuenta(nombretitular, monto) {
    override fun detalles() {
        println("Esta en una cuenta de plazo fijo")
        println("Tiene un plazo de : $dias dias ")
        println("A un intereses: $interes %")
        val beneficiosbanco =  interes * monto / 100
        println("Importe del interes: $beneficiosbanco")
        super.detalles()
    }
}


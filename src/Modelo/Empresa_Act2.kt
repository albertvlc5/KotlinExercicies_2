package Modelo

data class Empresa(var nombre:String =" ", var añofundacion: String =" ", var empleados: MutableList<String> = mutableListOf()) { }
data class Empleado(var nombre: String=" ", var apellido: String= " ", var fechanacimiento: String= " ", var fechacontrato:String= " ") { }

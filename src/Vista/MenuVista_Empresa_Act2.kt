package Vista

class MenuVista_Empresa_Act2 () {
    fun imprimeMenu(): String? {
        println("***** Operaciones *****")
        println("------------------------")
        println("1. -Crear una empresa ")
        println("2. -Añadir un empleado a una empresa")
        println("3. -Ver listado de empresas")
        println("4. -Ver informacion de una empresa")
        println("5. -Crear un empleado")
        println("6. -Ver listado de empleados")
        println("7. -Ver informacion de un empleado")
        println("8. - Salir")
        println("Eliga la operación a realizar :")
        var opcion = readLine()
        return opcion
    }
}


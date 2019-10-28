package Modelo

data class Dado (var valor: Int) {
    override fun toString(): String {
        var resultado = ""
        for(i in 1..valor)
            resultado = resultado +"*"
        return resultado
    }
}
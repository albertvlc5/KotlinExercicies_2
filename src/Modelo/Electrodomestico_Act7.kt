package Modelo

class Electrodomestico () {
    var precio: Double=200.0
    var color: String="Blanco"
    var consumo: String="B"
    var peso : Double=5.0

    constructor(precio: Double, peso: Double) : this (){
        this.precio = precio;
        this.peso = peso;
    }
    constructor(precio: Double, color:String, consumo:String, peso: Double) : this (){
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    fun comprobarColor() {
        val colores = arrayOf("Blanco", "Metal", "Rojo", "Verde", "Azul")
        var tengocolor = false
        var i = 0

        while (i < colores.size && !tengocolor) {
            if (colores[i] == color) {
                tengocolor = true
            }
            i++
        }

        if (tengocolor == true) {
            println("Color encontrado y correcto")
        } else {
            println("Color Introducido incorrecto")
        }

    }

    fun comprobarConsumoElectrico() {
        val letras =arrayOf("A","B","C","D","E","F")
        var tengoletra = false
        var j = 0

        while(j < letras.size && !tengoletra) {
            if (letras[j] == consumo) {
                tengoletra = true
            }
            j++
        }
        if (tengoletra == true) {
            println("Letra consumo correcta")
        }else {
            println("Letra consumo incorrecta")
        }

    }

    fun precioFinal():Double {
        var augmento = 0.0
        when (consumo) {
            "A" -> augmento += 100.0
            "B"-> augmento += 80.0
            "C" -> augmento += 60.0
            "D"-> augmento += 50.0
            "E" -> augmento += 30.0
            "F" -> augmento += 10.0
        }
        if (peso >= 0 && peso < 19)  {
            augmento += 10.0
        } else if (peso >= 20 && peso < 49) {
            augmento += 50.0
        } else if (peso >= 50 && peso <= 79) {
            augmento += 80.0
        } else if (peso >= 80) {
            augmento += 100.0
        }
        return precio + augmento
    }
}




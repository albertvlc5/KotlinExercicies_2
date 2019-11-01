package Actividad7

open class Electrodomestico () {
    var precioB: Double=200.0
    var color: String="Blanco"
    var consumo: Char='B'
    var peso : Double=5.0

    init {
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
    }

    constructor(precioB: Double, peso: Double) : this (){
        this.precioB = precioB;
        this.peso = peso;
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
    }
    constructor(precioB: Double, color:String, consumo:Char, peso: Double) : this (){
        this.precioB = precioB;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        comprobarConsumoElectrico(consumo);
        comprobarColor(color);
    }

    fun getPrecioBase():Double{
        return this.precioB;
    }
    fun setPrecioBase(precio:Double){
        this.precioB= precio;
    }


    private fun comprobarColor(color:String) {
        val colores = arrayOf("Blanco", "Metal", "Rojo", "Verde", "Azul")
        val tengocolor = colores.contains(color)

        if(!tengocolor){
            this.color="Blanco"
        }
        /*var tengocolor = false
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
        }*/

    }

    fun comprobarConsumoElectrico(letra: Char) {
        val letras =arrayOf('A','B','C','D','E','F')
        val tengoletra= letras.contains(letra)
        if (!tengoletra){
            this.consumo = 'B'}
    }
        /*var tengoletra = false
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
        }*/

    open fun precioFinal()  {
        when (this.consumo) {
            'A' -> this.precioB += 100.0
            'B'-> this.precioB += 80.0
            'C' -> this.precioB += 60.0
            'D'-> this.precioB += 50.0
            'E' -> this.precioB += 30.0
            'F' -> this.precioB += 10.0
        }
        if (this.peso >= 0 && this.peso < 19)  {
            this.precioB += 10.0
        } else if (this.peso >= 20 && this.peso < 49) {
            this.precioB += 50.0
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precioB += 80.0
        } else if (this.peso >= 80) {
            this.precioB += 100.0
        }

    }




}





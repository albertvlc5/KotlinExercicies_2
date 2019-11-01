package Actividad7

class Lavadora:Electrodomestico {
    private var carga :Double = 5.0;
    constructor():super()
    constructor(precio:Double, peso:Double): super(precio, peso )
    constructor(precioB: Double,color:String,consumo:Char,peso:Double, carga:Double):super(precioB,color,consumo,peso){
        this.carga = carga;
    }

    fun getCarga():Double{
        return this.carga;
    }
    override fun precioFinal(){
        super.precioFinal()
        if(this.carga>30){
            super.setPrecioBase(
                super.getPrecioBase()+50)
        }

    }
}
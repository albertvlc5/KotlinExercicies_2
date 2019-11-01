package Actividad7

class Television:Electrodomestico{
    private var TDT: Boolean=false;
    private var resolucion: Int = 20;
    constructor():super()
    constructor(precio:Double, peso:Double): super(precio, peso )
    constructor( precioB: Double, color:String, consumo:Char,  peso:Double, res:Int, tdt:Boolean):super(precioB,color,consumo,peso){
        this.resolucion = res;
        this.TDT = tdt;
    }
    fun getTDT():Boolean{return this.TDT}
    fun getResolucion():Int{return this.resolucion}

    override fun precioFinal() {
        super.precioFinal()
        if(this.resolucion>40){
            super.setPrecioBase(
                super.getPrecioBase()*130/100)
        }
        if(this.TDT){
            super.setPrecioBase(
                super.getPrecioBase()+50
            )
        }
    }
}
package Actividad7

fun main(){
    var lista :MutableList<Electrodomestico> = mutableListOf(
        Television(500.0,"",'A',7.0,54,true),
        Lavadora(100.0,"",'B',29.0,7.0),
        Television(750.0,"",'C',9.0,40,true),
        Lavadora(250.0,"",'D',38.0,8.0)
    )

    for (i in lista){
        i.precioFinal();
    }

    var cont1 =1
    for (i in lista){
        if(i is Television){
            println("La tv $cont1 vale " + i.getPrecioBase() + " €")
            cont1++
        }
    }
    var cont2=1;
    for (i in lista){
        if(i is Lavadora){
            println("La lavadora $cont2 vale: " + i.getPrecioBase()+ " €")
            cont2++

        }
    }


}
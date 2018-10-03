package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){
    /*var x = 10
    while (x< 100){
        println("x=$x")
        x++
    }

    x =10
    do{
        x++
        println("x=$x")
    }while(x<=100)
*/
    print("Ingrese un numero:")
    var numero = readLine()!!.toInt()
    var resultado = 1
    while (numero >=1){
        resultado *= numero
        numero --
    }
    println("El factorial es : $resultado")
}
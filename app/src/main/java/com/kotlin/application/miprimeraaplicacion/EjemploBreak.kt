package com.kotlin.application.miprimeraaplicacion

fun main(args : Array<String>){
    /*for(x in 0..10){
        if (x==5){
            print("encontrado")
            break
        }
        println("aun no se encuentra")
    }*/

    /*
    //numeros primos
    for (x in 0..10){
        if ( x.rem(2) != 0){
            println("el numero $x es primo")
        }
    }*/

    print("ingrese un numero");
    var numero = readLine()!!.toInt();
    var numDigitos = numero.toString().length

    var arraNumeros = IntArray(numDigitos)

    /*println(numero.toString().substring(0,1))
    println(numero.toString().substring(1,2))
    println(numero.toString().substring(2,3))*/
    var ini = 0
    var fin = 1
    for (x in 0..numDigitos-1){
        var dato = numero.toString().substring(ini,fin)
        arraNumeros[x] = dato.toInt()
        ini++
        fin++
    }

    var numeromayo ="";
    arraNumeros.sortDescending()
    arraNumeros.forEach {
        //print("${it} ")
        numeromayo = numeromayo+""+it.toString()
    }
    print(numeromayo)
}
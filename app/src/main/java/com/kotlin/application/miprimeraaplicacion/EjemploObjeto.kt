package com.kotlin.application.miprimeraaplicacion
/*
class Auto(tipo: String, velocidad: Int, numeroAsiento : Int){
}

fun main(args: Array<String>){
    var automovil = Auto("hyunday", 30, 4)
    println(automovil)
}
*/
class Camioneta{
    var tipo : String? = null
    var maxVelocidad : Int? = null
    var numAsiento : Int? = null
}

fun main(args: Array<String>){
    var bmv = Camioneta()
    bmv.tipo = "bmw"
    bmv.maxVelocidad = 30
    bmv.numAsiento = 4


    println("tipo : ${bmv.tipo}")
    println("maxVelocidad : ${bmv.maxVelocidad}")
    println("numAsiento: ${bmv.numAsiento}")
}
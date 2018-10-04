package com.kotlin.application.miprimeraaplicacion

open class Alumno1(){
    var nombres : String? = null
    var edad : Int? = null

    constructor(nombres: String , edad: Int):this(){
        this.nombres = nombres
        this.edad = edad

        println("nombre: ${this.nombres}")
        println("edad: ${this.edad}")
    }
}


//class Profesor() : Alumno1()

class Profesor : Alumno1{
    constructor(nombres: String, edad: Int, apellidos: String):
            super(nombres, edad)
}
fun main(args : Array<String>){
    var alumno1 = Alumno1("Giancarlo", 32)
    var profesor1 = Profesor("Fernando", 40, "aaaa")
    var alumno2 = Alumno(1, "AAAA", "436745071")
}
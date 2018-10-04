package com.kotlin.application.miprimeraaplicacion

class Alumno {
    var codigo: Int? = null
    var nombre: String? = null
    var documento: String? = null

    constructor(codigo: Int, nombre: String, documento: String) {
        this.codigo = codigo
        this.nombre = nombre
        this.documento = documento

        println("codigo: ${this.codigo}")
        println("nombre: ${this.nombre}")
        println("documento: ${this.documento}")
    }
}

//para verificar el codigo https://www.sonarqube.org/features/multi-languages/
fun main(args : Array<String>){
    var alumno1 = Alumno(1, "Giancarlo", "43674507")
}

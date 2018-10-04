package com.kotlin.application.miprimeraaplicacion

interface AlumnoDao{
    fun guardarAlumno()
    fun buscarAlumno()
    fun eliminarALumno()
    fun actualizarAlumnmo()
}

class AlumnoDaoImpl: AlumnoDao {
    private var nombre : String? = null
    var apellidos : String? = null

    override fun guardarAlumno() {
        TODO("not implemented")
    }

    override fun buscarAlumno() {
        TODO("not implemented")
    }

    override fun eliminarALumno() {
        TODO("not implemented")
    }

    override fun actualizarAlumnmo() {
        TODO("not implemented")
    }

    fun getNombre():String?{
        return this.nombre
    }

    fun getLastName():String?{
        return this.apellidos
    }
}

fun main(args : Array<String>){
    var alumnoDao1:AlumnoDao = AlumnoDaoImpl()
    var alumno2 = AlumnoDaoImpl()
    alumno2.getLastName()

}
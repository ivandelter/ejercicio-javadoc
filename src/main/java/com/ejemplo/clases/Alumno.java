package com.ejemplo.clases;

/*
* La clase alumno es un modelo para representar a un alumno.
* Se compone de 3 atributos:
* Identificador: Un string que va a ser única y es la forma de identificar al alumno
* Nombre: Un string que representa el nombre del alumno
* Curso: Un string que dicta qué curso realiza
* */

public class Alumno {
    private String identificador;
    private String nombre;
    private String curso;

    // Constructor
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    public void matricular(String curso){
        this.curso = curso + " 1";
    }

    public void pasarDeCurso(){
        String[] curso = this.curso.split(" ");
        int numeroCurso = Integer.parseInt(curso[1]);
        if(numeroCurso == 1)
        {
            this.curso = curso[0] + " " + (numeroCurso + 1);
        }
        else{
            this.curso = "Titulado en " + curso[0];
        }

    }

    // Getters y Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /*
    * Devuelve el atributo nombre de la clase Alumno
    * */
    public String getNombre() {
        return nombre;
    }

    /*
    * Establece el atributo nombre con un string dado
    * @param nombre Un String
    * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

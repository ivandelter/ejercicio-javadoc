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

    /**
     * Construye un alumno con un identificador, nombre y curso.
     *
     * @param identificador Identificador único de alumno
     * @param nombre Nombre del alumno
     * @param curso Curso que el alumno realiza
     */
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    /**
     * Asigna un nuevo curso al alumno que recibe como parámetro
     * y le añade un 1 para indicar que está matriculado en primero.
     *
     * @param curso
     */
    public void matricular(String curso){
        this.curso = curso + " 1";
    }

    /**
     * El método modifica el atributo curso: Si el alumno está en primero, cambia
     * al siguiente curso, poniendo un 2 al final del string. Por otro lado, si el alumno
     * ya se encuentra en segundo, indica que el alumno está "Titulado en x"
     *
     */
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

    /**
     * Devuelve el atributo identificador de la clase Alumno
     *
     * @return El atributo identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Establece el atributo identficador con un String dado
     *
     * @param identificador Un String
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
    * Devuelve el atributo nombre de la clase Alumno
     *
    * @return El atributo nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Establece el atributo nombre con un string dado
    * @param nombre Un String
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el atributo curso de la clase Alumno.
     *
     * @return El atributo curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Establece el atributo curso con un string dado
     *
     * @param curso Un String
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}

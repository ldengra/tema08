package com.luisdengra.tema08.ejercicio02;

public class Asignatura {

    private String nombreAsignatura;
    private int codgoAsignatura;
    private int cursoAsignatura;


    //constructor


    public Asignatura(String nombreAsignatura, int codgoAsignatura, int cursoAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.codgoAsignatura = codgoAsignatura;
        this.cursoAsignatura = cursoAsignatura;

    }

    //setters y getters


    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCodgoAsignatura() {
        return codgoAsignatura;
    }

    public void setCodgoAsignatura(int codgoAsignatura) {
        this.codgoAsignatura = codgoAsignatura;
    }

    public int getCursoAsignatura() {
        return cursoAsignatura;
    }

    public void setCursoAsignatura(int cursoAsignatura) {
        this.cursoAsignatura = cursoAsignatura;
    }
}

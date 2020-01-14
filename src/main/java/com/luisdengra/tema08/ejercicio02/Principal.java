package com.luisdengra.tema08.ejercicio02;

public class Principal {

    public static void main(String[] args) {

        Asignatura asig1 = new Asignatura("Programación", 1017, 1);

        System.out.println("La asignatura " + asig1.getNombreAsignatura() + " tiene el codigo " + asig1.getCodgoAsignatura() + " del curso numero " + asig1.getCursoAsignatura());

    }
}

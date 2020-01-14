package com.luisdengra.tema08.ejercicio01;

public class Principal {

    public static void main(String[] args) {

        Coche miCoche1 = new Coche("ford","azul", false, 1888, "deportivo", 2019, "terceros");
        Coche miCoche2 = new Coche("volskwagen", "negro");
        Coche miCoche3 = new Coche();
        //con el setaño, cambio el año del coche
        miCoche3.setAnyoFabricacion(1992);
        //con el getaño, puedo visualizar el año que le acabo de poner
        System.out.println(miCoche3.getAnyoFabricacion());
    }
}

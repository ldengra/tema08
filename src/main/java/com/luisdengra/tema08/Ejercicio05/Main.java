package com.luisdengra.tema08.Ejercicio05;

import com.luisdengra.tema08.Ejercicio4.Punto;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2.5, 4.5);
        Circulo c1 = new Circulo(p1, 5);
        imprimirCirculo(c1);
        Circulo c2 = new Circulo(3.5, 4.5, 5.5);
        imprimirCirculo(c2);
        Circulo c3 = new Circulo();
        Punto p2 = new Punto (3,5);
        c3.setCentro(p2);
        c3.setRadio(4.5);
        imprimirCirculo(c3);
        Circulo c4 = new Circulo();
        c4.setCentro(2.5,4.5);
        c4.setRadio(4.5);
        imprimirCirculo(c4);
        System.out.printf("La distancia es: %.2f %n", c3.calcularDistancia(c4.getCentro()));
    }
    public static void imprimirCirculo(Circulo c){
        c.verCirculo();
        System.out.printf("El área es: %.2f %n", c.calcularArea());;
        System.out.printf("El perímetro es: %.2f %n",c.calcularPerimetro());
    }
}

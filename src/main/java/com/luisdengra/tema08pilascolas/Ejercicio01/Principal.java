package com.luisdengra.tema08pilascolas.Ejercicio01;

public class Principal {
    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        System.out.println(p1.pop());
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);
        p1.push(6);
        p1.push(7);
        p1.push(8);
        p1.push(9);
        p1.push(10);
        p1.push(11);
        p1.push(12);
        p1.push(13);
        p1.push(14);
        p1.push(15);
        System.out.println(p1.pop());
        System.out.println(p1.toString());


    }
}

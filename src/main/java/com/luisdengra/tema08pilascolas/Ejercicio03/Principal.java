package com.luisdengra.tema08pilascolas.Ejercicio03;


public class Principal {
    public static void main(String[] args) {
        Cola p1 = new Cola(10);
        p1.push(5);
        p1.push(7);
        p1.push(1);
        System.out.println(p1.toString());
        System.out.println(p1.pop());
        System.out.println(p1.toString());

    }
}

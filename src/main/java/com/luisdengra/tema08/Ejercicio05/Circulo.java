package com.luisdengra.tema08.Ejercicio05;

import com.luisdengra.tema08.Ejercicio4.Punto;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(double radio,double x, double y) {
        this.radio = radio;
        this.centro = new Punto(x,y);
    }

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(){
        this.radio = -1;
        this.centro = new Punto(-1,-1);
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public void setCentro(double x, double y) {
        this.centro = new Punto(x,y);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularDistancia(Punto p2){
        return centro.calcularDistanciaDesde(p2);
    }
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    public void verCirculo(){
        System.out.printf("Círculo de radio %.2fcm situado",radio);
        if (centro.getY() == 0 && centro.getX() == 0){
            System.out.printf("en el origen de coordenadas. %n");
        }else{
            System.out.printf("en el punto (%.2f, %.2f).%n", centro.getX(), centro.getY());
        }
    }
}

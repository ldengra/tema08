package com.luisdengra.tema08.Ejercicio4;

public class Punto {

    //atributos

    private double x;
    private double y;

    //constructores

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        x=2.0;
        y=6.2;
    }

    //getters y setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaDesde(Punto parametros) {
        double cateto1 = parametros.getX();
        double cateto2 = parametros.getY();
        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return hipotenusa;

    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

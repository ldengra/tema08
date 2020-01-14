package com.luisdengra.tema08.ejercicio01;

public class Coche {

    //atributos... marca, modelo, color, numero de serie, fecha de compra, marca neumaticos.

    private String modelo;
    private String color;
    private boolean metalizada;
    private int matricula;
    private String tipoCoche; //mini, utilitario, familiar o deportivo. Crear ENUM
    private int anyoFabricacion;
    private String modalidadSeguro; //terceros o todo riesgo.

    //constructor
    public Coche(String modelo, String color, boolean metalizada, int matricula, String tipoCoche, int anyoFabricacion, String modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = false;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion  = anyoFabricacion;
        this.modalidadSeguro = modalidadSeguro;

    }

    public Coche(String modelo, String color){
        this.modelo = modelo;
        this.color = color;

    }

    public Coche(){

        this.modelo = "seat";
        this.color = "verde";
        this.metalizada = false;
        this.matricula = 198;
        this.tipoCoche = "Familiar";
        this.anyoFabricacion  = 2020;
        this.modalidadSeguro = "Todo Riesgo";

    }

    //metodos getter. Retorna el dato para poder imprimirlo

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getModalidadSeguro() {
        return modalidadSeguro;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    //metodos setter. Cambiamos el valor de la variable


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public void setModalidadSeguro(String modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }
}

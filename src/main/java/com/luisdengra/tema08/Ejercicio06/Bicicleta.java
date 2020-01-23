package com.luisdengra.tema08.Ejercicio06;


public class Bicicleta {
    //atributos
    private int referencia;
    private String marca;
    private String modelo;
    private float peso;
    private int pulgadasRueda;
    private String motor;
    private String fechaFabricacion;
    private float precio;
    private int numeroExistencias;

    //constructor.


    public Bicicleta(int referencia, String marca, String modelo, float peso, int pulgadasRueda, String motor, String fechaFabricacion, float precio, int numeroExistencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.pulgadasRueda = pulgadasRueda;
        this.motor = motor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.numeroExistencias = numeroExistencias;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getPulgadasRueda() {
        return pulgadasRueda;
    }

    public void setPulgadasRueda(int pulgadasRueda) {
        this.pulgadasRueda = pulgadasRueda;
    }

    public String isMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroExistencias() {
        return numeroExistencias;
    }

    public void setNumeroExistencias(int numeroExistencias) {
        this.numeroExistencias = numeroExistencias;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "referencia=" + referencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", pulgadasRueda=" + pulgadasRueda +
                ", motor='" + motor + '\'' +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", precio=" + precio +
                ", numeroExistencias=" + numeroExistencias +
                '}';
    }
}

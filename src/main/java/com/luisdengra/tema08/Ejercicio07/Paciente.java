package com.luisdengra.tema08.Ejercicio07;

import java.util.GregorianCalendar;

public class Paciente {

    //atributos. Crear 2 constructores, 1 para la alta y otra para la atencion
    private int sip;
    private String nombre;
    private String sexo;
    private int edad;
    private GregorianCalendar fechaEntrada;
    private String sintomatologia;



    //constructor.

    public Paciente(int sip, String nombre, String sexo, int edad, String sintomatologia) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaEntrada = new GregorianCalendar();
        this.sintomatologia = sintomatologia;

    }


    //getters y setters


    public int getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip=" + sip +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", fecha de entrada=" + fechaEntrada.get(GregorianCalendar.YEAR)+"/"+fechaEntrada.get(GregorianCalendar.MONTH+1) +"/" + fechaEntrada.get(GregorianCalendar.DAY_OF_MONTH)+ '\''+
                ", hora de entrada =" + fechaEntrada.get(GregorianCalendar.HOUR)+":"+fechaEntrada.get(GregorianCalendar.MINUTE)+ '\''+
                ", sintomatologia='" + sintomatologia + '\'' +
                '}';
    }
}

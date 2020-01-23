package com.luisdengra.tema08.Ejercicio07;

import java.util.GregorianCalendar;

public class Atencion {
    //atributos
    private Paciente pacientes;
    private double[] preRev;
    private GregorianCalendar fechaAlta;

    //constructor

    public Atencion(Paciente pacientes, double[] preRev, GregorianCalendar fechaAlta) {
        this.pacientes = pacientes;
        this.preRev = preRev;
        this.fechaAlta = fechaAlta;
    }

    //getters y setters


    public Paciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }

    public double[] getPreRev() {
        return preRev;
    }

    public void setPreRev(double[] preRev) {
        this.preRev = preRev;
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(GregorianCalendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}

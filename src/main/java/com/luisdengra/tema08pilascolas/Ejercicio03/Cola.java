package com.luisdengra.tema08pilascolas.Ejercicio03;

public class Cola {

    //atributos "crear array" como añadir y eliminar elementos dentro del array
    private static final int INITIAL_SIZE = 10;
    private double[] cola;
    private int contador; //numero elementos

    /**
     * Constructor
     */
    public Cola(){
        this(INITIAL_SIZE);
    }

    public Cola(int size) {
        cola = new double[size];
        contador = 0;
    }

    //metodos


    public void push (double n){
        if(contador == cola.length){
            cola = duplicarArray(cola);
        }
        cola[contador] = n;
        contador++;
    }

    private double[] duplicarArray(double[] cola){
        double[] aux = new double[cola.length * 2];

        for (int i = 0; i < cola.length; i++){
            aux[i] = cola[i];
        }
        return aux;

    }

    public double pop(){
        double aux = Integer.MIN_VALUE;
        if(!empty()){
            aux = cola[0];
            desplazarIzquierda(cola);
            contador--;
        }
        return aux;
    }

    public int size(){
        return contador;
    }

    public boolean empty() {
        return contador == 0;
    }

    public void desplazarIzquierda(double[] cola){
        for (int i = 0; i < contador; i++){
            cola[i] = cola[i+1];
        }
    }

    public String toString() {
        String aux = "";

        for (int i = 0; i < contador; i++)
            aux += String.format("%-10s", cola[i]);
        return aux;
    }

}

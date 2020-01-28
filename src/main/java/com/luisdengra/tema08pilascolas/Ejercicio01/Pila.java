package com.luisdengra.tema08pilascolas.Ejercicio01;

import java.util.Arrays;

public class Pila {

    //atributos "crear array" como añadir y eliminar elementos dentro del array
    private static final int INITIAL_SIZE = 10;
    private int[] datos;
    private int contador; //numero elementos

    //constructor

    /**
     * Este constructor es para iniciar el array de la pila con la longitud asignada en el FINAL. Si cuando creamos el
     * objeto, no le pasamos un parametro, cogera este constructor por defecto
     */
    public Pila(){
        this(INITIAL_SIZE);
    }

    /**
     *
     * @param size es el parametro entero que queremos que mida el array, cuando creamos el objeto, le pasamos como
     *             parametro el size
     */
    public Pila(int size) {
        datos = new int[size];
        contador = 0;
    }

    //metodos

    /**
     * Este metodo sirve para añadir ( hacer push) informacion a la pila, primero comprobamos si el array actual esta
     * lleno, si lo esta, creamos otro array llamando a su metodo que nos duplicara la capacidad del array.
     * Con contador++ controlamos la posicion del array para no machacar informacion
     * @param n es le dato que le pasamos desde el main que queremos añadir a la pila
     */
    public void push (int n){
        if(contador == datos.length){
            datos = duplicarArray(datos);
        }
        datos[contador] = n;
        contador++;
    }

    /**
     * Este metodo es para duplicar el array, primero duplicamos el array y despues copiamos del original al auxiliar.
     * @param datos le pasamos el array actual para saber su longitud y saber cuanta longitud de mas tenemos que añadir
     * @return devolvemos el aux que es el array ya copiado y multiplicado
     */
    private int[] duplicarArray(int[] datos){
        int[] aux = new int[datos.length * 2];

        for (int i = 0; i < datos.length; i++){
            aux[i] = datos[i];
        }
        return aux;

    }

    /**
     *
     * @return
     */
    public int pop(){
        int resultado = Integer.MIN_VALUE;
        if(!empty()){
            resultado = datos[contador -1];
            contador--;
        }
        return resultado;
    }

    public int size(){
        return contador;
    }

    public boolean empty() {
        return contador == 0;
    }

    public int top(){
        int resultado = Integer.MIN_VALUE;
        if(!empty()){
            resultado = datos[contador -1];
        }
        return resultado;
    }

    @Override
    public String toString() {
        String aux = "";

        for (int i = 0; i < contador; i++)
            aux += String.format("%-10s", datos[i]);
        return aux;
    }
}


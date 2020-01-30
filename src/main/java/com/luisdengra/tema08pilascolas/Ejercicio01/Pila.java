package com.luisdengra.tema08pilascolas.Ejercicio01;

import java.util.Arrays;

public class Pila {

    //atributos "crear array" como añadir y eliminar elementos dentro del array
    private static final int INITIAL_SIZE = 10;
    private double[] datos;
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
        datos = new double[size];
        contador = 0;
    }

    //metodos

    /**
     * Este metodo sirve para añadir ( hacer push) informacion a la pila, primero comprobamos si el array actual esta
     * lleno, si lo esta, creamos otro array llamando a su metodo que nos duplicara la capacidad del array.
     * Con contador++ controlamos la posicion del array para no machacar informacion
     * @param n es le dato que le pasamos desde el main que queremos añadir a la pila
     */
    public void push (double n){
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
    private double[] duplicarArray(double[] datos){
        double[] aux = new double[datos.length * 2];

        for (int i = 0; i < datos.length; i++){
            aux[i] = datos[i];
        }
        return aux;

    }

    /**
     *Este metodo es para quitar el ultimo elemento de la pila. Damos valor a la variable de resultado como MIN.VALUE
     * para poder diferenciar las posiciones que no han sido asignadas. si la posicion del array es diferente
     * a vacia.(Para ello usamo el metodo creado de empty), restamos 1 al contador de posiciones, asi que cuando
     * hagamos un push, machaque el dato anterior.
     * @return devuelve la pila con la posicion -1
     */
    public double pop(){
        double resultado = Integer.MIN_VALUE;
        if(!empty()){
            resultado = datos[contador -1];
            contador--;
        }
        return resultado;
    }

    /**
     * Este metodo sirve para ver la longitud usada de la pila
     * @return devuelve un int con el numero de posiciones utilizadas.
     */
    public int size(){
        return contador;
    }

    /**
     * Con este metodo podemos ver si la pila esta vacia, si el contador es igual a 0 devolvera true, si tiene algo
     * devolvera false
     * @return devuelve un booleano
     */
    public boolean empty() {
        return contador == 0;
    }

    /**
     * Este metodo sirve para leer la ultima posicion de la pila, pero sin borrarla, para ello hacemos lo mismo que
     * en el pop, si la pila no esta vacia, asignamos a resultado el valor de la ultima posicion de la pila
     * @return nos devuelve el valor de la ultima posicion de la pila
     */
    public double top(){
        double resultado = Integer.MIN_VALUE;
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


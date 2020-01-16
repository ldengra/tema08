package com.luisdengra.tema08.utils;

import java.util.Random;

public class Lib {
    /**
     * Genera un número aleatorio entre min y max
     * @param min El número mínimo a generar
     * @param max El número máximo a generar
     * @return número aleatorio entre min y max
     */
    public static int aleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    public static double aleatorioE(Double min, Double max) {
        Random rand = new Random();
        return  min + rand.nextDouble()* ( max - min );
    }

    /**
     * Limpia la pantalla de la consola generando 100 lineas en blanco.
     */
    public static void limpiarPantalla(){
        for(int i=0; i<100; i++){
            System.out.println();
        }
    }
    /**
     * Imprime la matriz por pantalla
     * @param matriz
     */
    public static void imprimirMatriz(int[] [] matriz){
        for (int i=0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j=0; j < matriz[i].length; j++) {
                System.out.print (matriz[i][j]);
                if (j!=matriz[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public static void imprimirMatriz(double[] [] matriz){
        for (int i=0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j=0; j < matriz[i].length; j++) {
                System.out.print (matriz[i][j]);
                if (j!=matriz[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
    /**
     * rellena una matriz de forma aleatoria
     * @param matriz
     */
    public static void rellenarMatrizAleatoria(int[][] matriz, int min, int max) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Lib.aleatorio(min, max);
            }
        }
    }

    public static void rellenarMatrizAleatoriaDouble(double[][] matriz, double min, double max) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Lib.aleatorioE(min, max);
            }
        }
    }

}

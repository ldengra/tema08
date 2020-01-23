package com.luisdengra.tema08.Ejercicio4;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        boolean condicion = false;
        double x1User, y1User, x2User, y2User;
        Punto porDefecto = new Punto(); //este es el punto creado por defecto

        do {


            System.out.println("Selecciona una opcion:");
            System.out.println("1. Crear punto por defecto.");
            System.out.println("2. Crear punto personalizado.");
            System.out.println("0. Salir.");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    //visualitzarPunt(porDefecto);
                    break;

                case 2:
                    System.out.println("Inserta el eje X del primer punto: ");
                    x1User = input.nextDouble();
                    input.nextLine();

                    System.out.println("Inserta el eje Y del primer punto: ");
                    y1User = input.nextDouble();
                    input.nextLine();

                    System.out.println("Inserta el eje X del segundo punto: ");
                    x2User = input.nextDouble();
                    input.nextLine();

                    System.out.println("Inserta el eje Y del segundo punto: ");
                    y2User = input.nextDouble();
                    input.nextLine();

                    Punto p1 = new Punto(x1User, y1User);
                    Punto p2 = new Punto(x2User, y2User);

                    //visualitzarPunt(p1);
                    //visualitzarPunt(p2);

                    double distancia = p1.calcularDistanciaDesde(p2);
                    System.out.println("La distancia de " + p1 + " mas " + p2 + " es " + distancia);


                    break;

                case 0:

                    condicion = true;
                    break;

                default:
                    System.out.println("inserta una opcion valida");
                    break;
            }
        }while(!condicion);
    }


    public void visualitzarPunt (Punto point){

        System.out.println(point.toString());

    }

}
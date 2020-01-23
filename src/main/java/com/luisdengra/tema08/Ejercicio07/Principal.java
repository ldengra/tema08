package com.luisdengra.tema08.Ejercicio07;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

public static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int opcion;

        do{
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    nuevoPaciente();
                    break;
                case 2:
                    //atenderPaciente();
                    break;
                case 3:
                    //Consultas();
                    break;
                case 4:
                    //altaMedica();
                    break;
                case 0:
                    //salir
                    break;
            }

        }while (opcion != 0);

    }

    private static int menuPrincipal() {
        int opcion = -1;
        do {

            System.out.println("***************************");
            System.out.println("**       URGENCIAS       **");
            System.out.println("***************************");
            System.out.println("1. Nuevo paciente...");
            System.out.println("2. Atender paciente...");
            System.out.println("3. Consultas...");
            System.out.println("4. Alta medica...");
            System.out.println("---------------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = input.nextInt();
            input.nextLine();
            if(opcion < 0 || opcion > 4) {
                System.out.println("Elija una opción del menú [0-4]");

            }
        } while (opcion < 0 || opcion > 4);
        return opcion;
    }

    private static void nuevoPaciente(){

        int sip;
        String nombre;
        String sexo;
        int edad;
        String sintomatologia;

        System.out.println("***NUEVO PACIENTE***");
        System.out.println("");
        System.out.println("Introduce el numero SIP: ");
        sip = input.nextInt();

        System.out.println("Nombre: ");
        nombre = input.nextLine();

        System.out.println("Sexo: ");
        sexo = input.nextLine();

        System.out.println("Edad: ");
        edad = input.nextInt();

        System.out.println("Sintomatologia: ");
        sintomatologia = input.nextLine();




    }
}

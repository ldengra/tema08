package com.luisdengra.tema08.Ejercicio07;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

public static Scanner input;
public static Paciente[] paciente = new Paciente[40];
public static int contadorPacientes=0;

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
                    atenderPaciente();
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
        input.nextLine();

        System.out.println("Nombre: ");
        nombre = input.nextLine();

        System.out.println("Sexo: ");
        sexo = input.nextLine();

        System.out.println("Edad: ");
        edad = input.nextInt();
        input.nextLine();

        System.out.println("Sintomatologia: ");
        sintomatologia = input.nextLine();

        paciente[contadorPacientes] = new Paciente(sip, nombre, sexo, edad, sintomatologia);
        contadorPacientes++;
    }

    public static void atenderPaciente(){
        Atencion[] atendido = new Atencion[500];
        int sipPaciente;
        int pos=0;
        double temperatura;
        int ppm;
        int tenSis;
        int tenDias;

        System.out.println("Inserta el SIP del paciente");
        sipPaciente = input.nextInt();
        input.nextLine();

        pos = buscarPacientePorSIP(sipPaciente);

        System.out.println(paciente[pos].toString());

        System.out.println("Temperatura: ");
        temperatura = input.nextInt();
        input.nextLine();

        System.out.println("Pulsaciones por minuto: ");
        ppm = input.nextInt();
        input.nextLine();

        System.out.println("Tension sistolica:");
        tenSis = input.nextInt();
        input.nextLine();

        System.out.println("Tension diastolica: ");
        tenDias = input.nextInt();
        input.nextLine();



    }

    static int buscarPacientePorSIP(int referencia) {
        for(int i = 0; i < contadorPacientes; i++) {
            if (paciente[i].getSip() == referencia) {
                return i;
            }
        }
        return -1;
    }
}

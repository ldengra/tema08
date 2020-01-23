package com.luisdengra.tema08.Ejercicio06;


import java.util.Scanner;

public class Principal {

    static Scanner input = new Scanner(System.in);
    public static final int MAX_BICICLETAS = 500;
    public static Bicicleta[] bicicletas = new Bicicleta[MAX_BICICLETAS];
    static int contadorBicis = 0;


    public static void main(String[] args) {
        int opcion;
        boolean opcionValida = false;


        do {
            System.out.println("*************************");
            System.out.println("**GESTIÓN DE BICICLETAS**");
            System.out.println("*************************");
            System.out.println("1.-Añadir bicicleta.");
            System.out.println("2.-Vender bicicleta.");
            System.out.println("3.-Consultar bicicleta.");
            System.out.println("4.-Mostrar stock.");
            System.out.println("------------------------------------");
            System.out.println("0.- Salir");
            opcion = input.nextInt();
            input.nextLine();


            switch (opcion) {
                case 1:
                    altaBicicleta();
                    break;

                case 2:
                    venderBicicleta();
                    break;

                case 3:
                    consultarBicicleta();
                    break;

                case 4:
                    mostrarStock();
                    break;

                case 0:
                    opcionValida = true;
                    break;

                default:
                    break;
            }

        } while (!opcionValida);
    }

    /**
     * metodo para dar de alta una bicicleta nueva
     */
    static void altaBicicleta(){
        boolean validado = false; //sirve para validar el do while
        int referencia; //numero de identidad de marca+modelo
        String marca;
        String modelo;
        float peso;
        int pulgadasRueda;
        String motor;
        String fechaFabricacion;
        float precio;
        int numeroExistencias = 0; //con este atributo controlo el stock, ya sea para sumar o restar el stock

        //creamos el menu
        System.out.println("***NUEVA ALTA***");
        System.out.println("");
        System.out.println("REFERENCIA: ");
        referencia = input.nextInt();
        input.nextLine();
        System.out.println("MARCA: ");
        marca = input.nextLine();
        System.out.println("MODELO: ");
        modelo = input.nextLine();
        System.out.println("PESO: ");
        peso = input.nextFloat();
        input.nextLine();
        System.out.println("PULGADAS: ");
        pulgadasRueda = input.nextInt();
        input.nextLine();
        System.out.println("MOTOR? si/no: ");
        motor = input.nextLine();
        System.out.println("FECHA DE FABRICACION: dd/mm/aaaa");
        fechaFabricacion = input.nextLine();
        System.out.println("PRECIO: ");
        precio = input.nextFloat();
        input.nextLine();
        numeroExistencias++;
        bicicletas[contadorBicis] = new Bicicleta(referencia,marca,modelo,peso,pulgadasRueda,motor,fechaFabricacion,precio, numeroExistencias);
        contadorBicis++;

        System.out.println("Bicicleta añadida con exito.");

    }

    static void venderBicicleta(){
        int referencia;
        int pos;

        System.out.println("**VENDER BICICLETA**");
        System.out.println("");
        System.out.println("Introduce el numero de referencia: ");
        referencia = input.nextInt();
        input.nextLine();
        pos = buscarBiciPorReferencia(referencia);
        if(pos >= 0) {
            bicicletas[pos] = null;
            contadorBicis--;
            desplazar(bicicletas, pos+1);
            System.out.println("Bicicleta vendida correctamente");
        } else {
            System.out.println("No existe ninguna bicicleta con esta referencia" + referencia);
        }
        bicicletas[pos].setNumeroExistencias(-1);

    }

    static void desplazar(Bicicleta[] bicicletas, int pos) {
        int i = pos;
        boolean fin = false;
        while(i < bicicletas.length && !fin) {
            fin = bicicletas[i] == null;
            if(!fin) {
                bicicletas[i-1] = bicicletas[i];
                bicicletas[i] = null;
            }
            i++;
        }
    }




    static void consultarBicicleta(){
        boolean salir = false;
        int opcion;

        do {
            System.out.println("************************");
            System.out.println("** CONSULTA BICICLETA **");
            System.out.println("************************");
            System.out.println("1. Consultar por referencia.");
            System.out.println("2. Consultar por marca.");
            System.out.println("3. Consultar por modelo.");
            System.out.println("--------------------------------------------");
            System.out.println("0. Salir.");
            System.out.println("");
            System.out.println("Introduce la opcion deseada: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {

                case 1:
                    //referencia.
                    int referencia;
                    System.out.println("Referencia: ");
                    referencia = input.nextInt();
                    input.nextLine();
                    int pos = buscarBiciPorReferencia(referencia);
                    if (pos >= 0) {
                        System.out.println(bicicletas[pos].toString());
                    } else {
                        System.out.println("No se ha encontrado ninguna bicicleta con la referencia " + referencia);
                    }

                    break;

                case 2:
                    //marca.
                    String marca;
                    System.out.println("Marca: ");
                    marca = input.nextLine();

                    for (int i = 0; i < contadorBicis; i++) {
                        if (marca.equals(bicicletas[i].getMarca())) {
                            System.out.println(bicicletas[i].toString());
                        }
                    }
                    break;

                case 3:
                    //modelo.
                    String modelo;
                    System.out.println("Modelo: ");
                    modelo = input.nextLine();

                    for (int i = 0; i < contadorBicis; i++) {
                        if (modelo.equals(bicicletas[i].getModelo())) {
                            System.out.println(bicicletas[i].toString());
                        }
                    }
                    break;

                case 0:
                    //salir. Quiero hacer llamada al main, pero me pide un argumento
                    salir = true;
                    break;
            }
        }while (!salir);


    }

    static int buscarBiciPorReferencia(int referencia) {
        for(int i = 0; i < contadorBicis; i++) {
            if (bicicletas[i].getReferencia() == referencia) {
                return i;
            }
        }
        return -1;
    }

    static void mostrarStock(){
        int referencia;
        System.out.println("Inserta referencia que quieres consultar: ");
        referencia = input.nextInt();
        input.nextLine();

        for (int i = 0; i < contadorBicis; i++){
            if (bicicletas[i].getReferencia() == referencia){
                System.out.println(bicicletas[i].getNumeroExistencias());
            }
        }
    }

}

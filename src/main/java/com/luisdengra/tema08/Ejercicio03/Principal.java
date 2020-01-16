package com.luisdengra.tema08.Ejercicio03;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static final int MAX_ALUMNOS = 500;
    public static Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    public static int alumnosCreados = 0;
    //public static final String tuplaAlumnos = alumnos[i].getNia()+"|"+alumnos[i].getNombre()+"|"+alumnos[i].getApellidos()+"|"+alumnos[i].getFechaNacimiento()+"|"+alumnos[i].getGrupo()+"|"+alumnos[i].getTelefono();

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        int opcion;
        boolean opcionCorrecta = false;

        do {
            System.out.println("*********************");
            System.out.println("** GESTIÓN ALUMNOS **");
            System.out.println("*********************");
            System.out.println("");
            System.out.println("1. Nuevo alumno.");
            System.out.println("2. Baja alumno.");
            System.out.println("3. Consultas.");
            System.out.println("------------------------------");
            System.out.println("0. Salir.");
            System.out.println("Inserta la opción deseada");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    nuevoAlumno();
                    opcionCorrecta = false;
                    break;

                case 2:
                    bajaAlumno();
                    break;

                case 3:
                    consultas();
                    break;

                case 0:
                    //salir
                    opcionCorrecta = true;
                default:
                    System.out.println("Opcion incorrecta, inserta la opción de nuevo.");
                    break;
            }

        }while (!opcionCorrecta);
    }

    public static void nuevoAlumno(){


        Scanner input = new Scanner(System.in);
        boolean opcionValidada = false;
        int nia = 0;
        String nombre = "";
        String apellidos = "";
        String fechaNacimiento = "";
        String grupo = "";
        int telefono = 0;
        int creacionAlumnos = 0;

        System.out.println("¿Cuantos alumnos nuevos quieres crear? ");
        creacionAlumnos = input.nextInt();
        input.nextLine();

        for(int i = 0; i < creacionAlumnos; i++) {

            do {
                System.out.println("Introduce el NIA del alumno: ");
                nia = input.nextInt();
                input.nextLine();
                //opcionValidada = validarNia(nia);

            } while (opcionValidada);

            do {
                System.out.println("Introduce el nombre del alumno: ");
                nombre = input.nextLine();

                System.out.println("Introduce los apellidos del alumno: ");
                apellidos = input.nextLine();
                //opcionValidada = validarNombreApellidos(String nombre, String apellidos);
            } while (opcionValidada);

            System.out.println("Introduce la fecha de nacimiento: DD/MM/AAAA");
            fechaNacimiento = input.nextLine();

            System.out.println("Introduce el grupo del alumno: ");
            grupo = input.nextLine();

            System.out.println("Introduce el telefono del alumno: ");
            telefono = input.nextInt();
            input.nextLine();

            alumnos[i] = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);
            //System.out.println(alumnos[i].getNia()+"|"+alumnos[i].getNombre()+"|"+alumnos[i].getApellidos()+"|");

            System.out.println(alumnos[i].toString());

            alumnosCreados++;

        }
    }

    public static void bajaAlumno(){
        Scanner input = new Scanner(System.in);
        int niaBaja;

        System.out.println("Inserta el NIA del alumno que quieras dar de baja: ");
        niaBaja = input.nextInt();
        input.nextLine();

        for(int i = 0; i < alumnosCreados; i++){
            if (niaBaja==alumnos[i].getNia()){
                alumnos[i].setNia(-1);
                alumnos[i].setNombre("");
                alumnos[i].setApellidos("");
                alumnos[i].setFechaNacimiento("");
                alumnos[i].setGrupo("");
                alumnos[i].setTelefono(-1);
                System.out.println("El alumno con numero de NIA "+ niaBaja + " ha sido dado de baja.");
            }else{
                System.out.println("El NIA introducido no pertenece a ningun alumno");
            }
        }


    }


    /*public static boolean validarNia(int nia){
        for (int i = 0;  i < alumnos.length; i++){
            if( nia == alumnos[i].getNia()){
                return true;
            }
        }
        return false;
    }*/



    //public static boolean validarNombreApellidos(String nombre, String apellidos) {
        //return;
    //}

    public static void consultas() {
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("");
        System.out.println("1. Por grupo.");
        System.out.println("2. Por edad.");
        System.out.println("3. Por nia.");
        System.out.println("4. Por apellidos.");
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("0. Volver al menú principal.");

        System.out.println("introduce la opcion deseada: ");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                grupo();
                break;

            case 2:
                //edad();
                break;

            case 3:
                //nia();
                break;

            case 4:
                //apellidos();
                break;

            case 0:
                //salir
                //opcionCorrecta = true;
            default:
                System.out.println("Opcion incorrecta, inserta la opción de nuevo.");
                break;
        }

    }

    public static void grupo(){
        Scanner input = new Scanner(System.in);
        String nombreGrupo;
        System.out.println("Inserta el grupo que quieres hacer la busqueda: ");
        nombreGrupo = input.nextLine();

        for(int i = 0; i < alumnosCreados; i++){
            if(nombreGrupo.equals(alumnos[i].getGrupo())){
                System.out.println(alumnos[i].getNia()+"|"+alumnos[i].getNombre()+"|"+alumnos[i].getApellidos()+"|"+alumnos[i].getFechaNacimiento()+"|"+alumnos[i].getGrupo()+"|"+alumnos[i].getTelefono());
            }
        }

    }

    /*public static void edad(){
        Scanner input = new Scanner(System.in);

        String edadCalculada;
        System.out.println("Inserta el grupo que quieres hacer la busqueda: ");
        edadCalculada = input.nextLine();

        for(int i = 0; i < alumnosCreados; i++){
            String anyos = obtenerEdad(alumnos[i].getFechaNacimiento());
            if(edadCalculada.equals(alumnos[i].getFechaNacimiento())){
                System.out.println(alumnos[i].getNia()+"|"+alumnos[i].getNombre()+"|"+alumnos[i].getApellidos()+"|"+alumnos[i].getFechaNacimiento()+"("+ anyos +") |"+alumnos[i].getGrupo()+"|"+alumnos[i].getTelefono());
            }
        }

    }*/

    public static int obtenerEdad(String fechaNacimiento) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/mm/aaaa");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        int edad;
        edad = periodo.getYears();

        return edad;
    }

}

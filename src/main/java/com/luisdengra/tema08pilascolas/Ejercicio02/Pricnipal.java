package com.luisdengra.tema08pilascolas.Ejercicio02;

import com.luisdengra.tema08pilascolas.Ejercicio01.Pila;



public class Pricnipal {
    public static void main(String[] args) {
        double operando1, operando2;
        Pila p1 = new Pila(10);

        String[] arrayOperacion = new String[]{"12","3","5","+","2","*","-"};

        for (int i = 0; i < arrayOperacion.length; i++){

            isNumeric(arrayOperacion[i]);
            if(isNumeric(arrayOperacion[i])){
                double doble = Double.parseDouble(arrayOperacion[i]);
                p1.push(doble);
            }else{
                operando2 = p1.pop();
                operando1 = p1.pop();
                switch (arrayOperacion[i]){

                    case "+":
                        p1.push(operando1+operando2);
                        break;
                    case "-":
                        p1.push(operando1-operando2);
                        break;
                    case "*":
                        p1.push(operando1*operando2);
                        break;
                    case "/":
                        p1.push(operando1/operando2);
                }
            }
        }

        System.out.println(p1.pop());
    }

    public static boolean isNumeric(String str){
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

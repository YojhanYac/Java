package bucles;

import java.util.Scanner;

public class Bucles {

    //ejercicio con bandera
    public static void main(String[] args) {

        boolean bandera = true;

        while (bandera == true) {

            System.out.println("El valor de la bandera es: " + bandera);
            System.out.println("Ingrese un número por teclado");        //vamos a ingresar números por teclado

            Scanner teclado = new Scanner(System.in);       //creo mi scaneador
            int tecla = teclado.nextInt();      //guardo el número que ingreso el usuario

            if (tecla == 1) {       //pregunto si lo que se ingreso es un 1
                bandera = false;        //aca cambio el valor de mi bandera si el usuario ingresa 1
            }
        }
    }
}

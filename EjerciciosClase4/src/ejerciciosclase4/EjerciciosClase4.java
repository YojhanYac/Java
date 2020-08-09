package ejerciciosclase4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EjerciciosClase4 {

    public static void main(String[] args) throws InterruptedException {

        //------------------------ Ejercicio 1 ------------------------//

        System.out.println("1) Realizar un programa que muestre en pantalla los números del 1 al 35(uno abajo del otro). Utilizar para esto alguna estructura repetitiva.");

        int valor = 0;

        System.out.println("\nInicio de secuencia:");

        do {
            System.out.println(++valor);
        }
        while (valor > 0 && valor < 35 );

        System.out.println("Fin de secuencia.");

        //------------------------ Ejercicio 2 ------------------------//

        System.out.println("2) Realizar un programa que dado por teclado un límite numérico (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1)");
        System.out.println("Ingrese un limite numerico para la función: ");
        
        Scanner teclado = new Scanner(System.in);
        
        int limite = teclado.nextInt();
        int valor2 = 0;

        System.out.println("\nInicio de secuencia:");
        do {
            System.out.println(++valor2);
        }
        while (valor2 > 0 && valor2 < limite );

        System.out.println("Fin de secuencia.");

        //------------------------ Ejercicio 3 ------------------------//

        System.out.println("3) Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos. La secuencia debería ser: 200...202...204..etc.");

        int valor3 = 198;

        System.out.println("\nInicio de secuencia:");

        do {
            valor3 = valor3 + 2;
            System.out.println(valor3);
        }
        while (valor3 >= 200 && valor3 < 250 );

        System.out.println("Fin de secuencia.");

        //------------------------ Ejercicio 4 ------------------------//

        System.out.println("4) Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.");        

        int valor4 = 10;

        System.out.println("\nInicio de secuencia:");
    
        while (valor4 >= 0 && valor4 <= 10) {
            System.out.println(valor4--);
            Thread.sleep(700);
        }

        System.out.println("Fin de secuencia.");

        //------------------------ Ejercicio 5 ------------------------//

        System.out.println("5) Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra \"salir\"");
        System.out.println("\nInicio de secuencia:");

        String palabra = "";

        while (!palabra.equals("salir")) {
            System.out.println("Ingrese una palabra: ");
            Scanner teclado2 = new Scanner(System.in);
            palabra = teclado2.nextLine();
            System.out.println("Se ingresó la palabra: " + palabra);
        }  

        System.out.println("Fin de la secuencia");
    }
}

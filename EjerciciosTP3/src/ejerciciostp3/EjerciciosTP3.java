package ejerciciostp3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EjerciciosTP3 {

    public static void main(String[] args) throws InterruptedException {

        //Ejercicio No 1: Estructuras Repetitivas
        System.out.println("-------------------------------------------------------------------------\n");
        //------------------------ Ejercicio 1 ------------------------//
        System.out.println("a) Realizar un programa que muestre en pantalla los números del 1 al 35(uno abajo del otro). Utilizar para esto alguna estructura repetitiva.");

        int valor = 0;

        do {
            System.out.println(++valor);
        }
        while (valor > 0 && valor < 35 );


        System.out.println("\n-------------------------------------------------------------------------\n");
        //------------------------ Ejercicio 2 ------------------------//
        System.out.println("b) Realizar un programa que dado por teclado un límite numérico (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1)");
        System.out.println("Ingrese un limite numerico para la función: ");
        
        Scanner teclado = new Scanner(System.in);

        int limite = teclado.nextInt();
        int valor2 = 0;

        do {
            System.out.println(++valor2);
        }
        while (valor2 > 0 && valor2 < limite );


        System.out.println("\n-------------------------------------------------------------------------\n");
        //------------------------ Ejercicio 3 ------------------------//
        System.out.println("c) Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos. La secuencia debería ser: 200...202...204..etc.");

        int valor3 = 198;

        do {
            valor3 = valor3 + 2;
            System.out.println(valor3);
        }
        while (valor3 >= 200 && valor3 < 250 );


        System.out.println("\n-------------------------------------------------------------------------\n");
        //------------------------ Ejercicio 4 ------------------------//
        System.out.println("d) Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.");        

        int valor4 = 10;
    
        while (valor4 >= 0 && valor4 <= 10) {
            System.out.println(valor4--);
            Thread.sleep(700);
        }


        System.out.println("\n-------------------------------------------------------------------------\n");
        //------------------------ Ejercicio 5 ------------------------//
        System.out.println("e)Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio.\nLos tipos de servicio son 3:\n1. Internet 30 megas (cuyo valor es de $750 – 10% de descuento)\n2. Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)\n3. Internet 100 megas (Cuyo valor fijo es de $1200)\nEl algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio con el que cuenta.");

        int dniCliente = 0;
        int tipoServicio = 0;
        double montoTotal = 0.0;

        System.out.println("Ingrese el DNI del cliente: ");

        Scanner teclado1 = new Scanner(System.in);
        dniCliente = teclado1.nextInt();

        System.out.println("Ingrese el número del tipo de servicio que posee el cliente con DNI " + dniCliente + " ingresado.\nLos tipos de servicio son 3:\n1 : Internet 30 megas (cuyo valor es de $750 – 10% de descuento)\n2 : Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)\n3 : Internet 100 megas (Cuyo valor fijo es de $1200)");

        Scanner teclado2 = new Scanner(System.in);
        tipoServicio = teclado2.nextInt();

        if (tipoServicio == 1) {

            montoTotal = 750 - (750 * 0.1);
            System.out.println("El cliente con DNI " + dniCliente + " tiene un monto a pagar de $" + montoTotal + " con el número de servicio: " + tipoServicio);
        } else {
            if (tipoServicio == 2) {
                montoTotal = 930 - (930 * 0.05);
                System.out.println("El cliente con DNI " + dniCliente + " tiene un monto a pagar de $" + montoTotal + " con el número de servicio: " + tipoServicio);
            } else {
                if (tipoServicio == 3) {
                    montoTotal = 1200.0;
                    System.out.println("El cliente con DNI " + dniCliente + " tiene un monto a pagar de $" + montoTotal + " con el número de servicio: " + tipoServicio);
                } else {
                    System.out.println("Valor ingresado inválido, tipos de servicio:\n1 para Internet 30 megas\n2 para Internet 50 megas\n3 para Internet 100 megas");
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------------------\n");

    }
    
}

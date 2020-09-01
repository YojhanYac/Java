package ejerciciostp4;

import java.util.Scanner;

public class EjerciciosTP4 {

    public static void main(String[] args) {
        
        //Guías de Ejercicios Nº 4
        //“Vectores y Matrices”

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.a) Llevar a cabo un programa que incluya un vector que almacene los siguientes nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.");

        String nombres [] = new String [8];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese un nombre " + (i+1) +": ");
            nombres [i] = teclado.next();
        }

        System.out.println("\nLos nombres ingresados son: ");

        for (int l = 0; l < nombres.length; l++) {
            System.out.println((l+1) + " " + nombres[l]);
        }

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.b) Realizar un programa que permita la carga por teclado de 10 números en un vector. Una vez cargados, se necesita que el programa determine cuál es el mayor y cuál es el menor de ellos.");

        double numeros [] = new double [10];
        double mayor = 0, menor = 0;

        Scanner teclado1 = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número: ");
            numeros [i] = teclado1.nextDouble();
            if (numeros [i] >= mayor) {
                mayor = numeros [i];
            } else {
                if (numeros [i] <= menor) {
                    menor = numeros [i];
                } 
            }
        }
        System.out.println("\nEl número mayor es: " + mayor + " y el número menor es: " + menor);

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.c) Realizar un programa que permita la carga por teclado de 15 números en un vector. Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3 (si es que fue cargado alguna vez).");

        double numeros1 [] = new double [15];
        Scanner teclado2 = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Ingrese un número: ");
            numeros1 [i] = teclado2.nextDouble();
            if(numeros1 [i] == 3) {
                contador++;
            }
        }
        System.out.println("\nLa cantidad de veces ingresado el número 3 es: " + contador);

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.d) Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esa carga, necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.");

        String posicion[] = {"er","do","er","to","to","to","mo","vo","no","mo","mo","mo"};
        Double sueldos [] = new Double [12];
        Double total = 0.0;

        Scanner teclado3 = new Scanner(System.in);

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el " + (i+1) + posicion[i] + " sueldo: ");
            sueldos [i] = teclado3.nextDouble();
            total = total + sueldos [i];
        }

        System.out.println("\nLa suma total de los doce sueldos es: " + total + "\nEl promedio de sueldo en el año es: " + (total/12));

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.e) En tres vectores diferentes se guardan los datos de temperaturas máximas y mínimas de 5 ciudades de Misiones. En el primer vector se guardan los nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última semana. Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).\n");

        String ciudades [] = new String [5];
        Double temperaturasMinimas [] = new Double [5];
        Double temperaturasMaximas [] = new Double [5];

        String posicion1[] = {"er","da","er","ta","ta"};
        Double temperaturaMasBaja = 0.0, temperaturaMasAlta = 0.0;
        int ciudadConTemperaturaMasBaja = 0, ciudadConTemperaturaMasAlta = 0;

        Scanner teclado4 = new Scanner(System.in);

        for (int i = 0; i < ciudades.length; i++) {

            System.out.println("Ingrese el nombre de la " + (i+1) + posicion1[i] + " ciudad: ");
            // ciudades [i] = teclado4.nextLine();
            ciudades [i] = teclado4.next();
            System.out.println("Ingrese la temperatura mínima registrada de " + ciudades [i] + ": ");
            temperaturasMinimas[i] = teclado4.nextDouble();
            System.out.println("Ingrese la temperatura máxima registrada de " + ciudades [i] + ": ");
            temperaturasMaximas[i] = teclado4.nextDouble();

            if (temperaturasMaximas[i] >= temperaturaMasAlta) {
                temperaturaMasAlta = temperaturasMaximas[i];
                ciudadConTemperaturaMasAlta = i;
            } else {
                if(temperaturasMaximas[i] <= temperaturaMasBaja) {
                    temperaturaMasBaja = temperaturasMaximas[i];
                    ciudadConTemperaturaMasBaja = i;
                }
            }
            if (temperaturasMinimas[i] >= temperaturaMasAlta) {
                temperaturaMasAlta = temperaturasMinimas[i];
                ciudadConTemperaturaMasAlta = i;
            } else {
                if (temperaturasMinimas[i] <= temperaturaMasBaja) {
                    temperaturaMasBaja = temperaturasMinimas[i];
                    ciudadConTemperaturaMasBaja = i;
                }
            }
        }
        System.out.println("\nLa ciudad con temperatura más alta es " + ciudades[ciudadConTemperaturaMasAlta] + " con " + temperaturaMasAlta + "°\nLa ciudad con temperatura más baja es " + ciudades[ciudadConTemperaturaMasBaja] + " con " + temperaturaMasBaja + "°");

        System.out.println("\n-------------------------------------------------------------------------\n");

    }
    
}

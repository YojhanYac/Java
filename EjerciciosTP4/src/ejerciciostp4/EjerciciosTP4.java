package ejerciciostp4;

import java.util.Scanner;

public class EjerciciosTP4 {

    public static void main(String[] args) {
        
        // Guías de Ejercicios Nº 4
        // “Vectores y Matrices”
        // Ejercicio Nº 1: Vectores

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
                if (i == 0) {
                    menor = numeros [i];
                }
            }
            if (numeros [i] <= menor) {
                    menor = numeros [i];
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

        // Ejercicio Nº 2: Matrices

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.a) Llevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5 (4 filas, 5 columnas).\n");

        int numeros2 [][]= new int [4][5];

        for (int f = 0; f < numeros2.length; f++) {
            for (int c = 0; c <numeros2[f].length; c++) {
                numeros2[f][c] = 5;
            }
        }

        for (int f = 0; f < numeros2.length; f++) {
            for (int c = 0; c < numeros2[f].length; c++) {
                System.out.print(numeros2[f][c] + "  ");
                if(c == (numeros2[f].length - 1)) {
                    System.out.print("\n");
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.b) Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma, será necesario realizar un recorrido por la misma y mostrar los datos cargados por pantalla.\n");

        String razasDePerros [][] = new String [3][3];

        Scanner teclado5 = new Scanner(System.in);

        for (int f = 0; f < razasDePerros.length; f++) {
            for (int c = 0; c < razasDePerros[f].length; c++) {
                System.out.println("Ingrese nombre de raza: ");
                razasDePerros[f][c] = teclado5.next();
            }
        }

        System.out.print("\nDatos cargados en matriz: \n");

        for (int f = 0; f < razasDePerros.length; f++) {
            for (int c = 0; c < razasDePerros[f].length; c++) {
                System.out.print(razasDePerros[f][c] + "  ");
                if(c == (razasDePerros[f].length - 1)) {
                    System.out.print("\n");
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.c) En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. Cada fila corresponde a las notas y al promedio de cada alumno.\n");

        Double alumnos [][] = new Double [4][4];

        Double promedio1 = 0.0;

        Scanner teclado6 = new Scanner(System.in);

        String posicion2[] = {"er","do","er","to"};

        String nombreDePosicion = "";

        for (int f = 0; f < alumnos.length; f++) {
            nombreDePosicion = (f+1) + posicion2[f];
            promedio1 = 0.0;
            System.out.print("\n");
            for (int c = 0; c < alumnos[f].length; c++) {
                if(c == (alumnos[f].length - 1)) {
                    alumnos[f][c] = promedio1 / 3;
                } else {
                    System.out.print("Ingrese la " + (c+1) + posicion2[c] + " nota del " + nombreDePosicion + " alumno: ");
                    alumnos[f][c] = teclado6.nextDouble();
                    promedio1 = promedio1 + alumnos[f][c];
                }
            }
        }

        for (int f = 0; f < alumnos.length; f++) {
            System.out.println("\nLas notas del " + (f+1) + posicion2[f] + " alumno: ");
            for (int c = 0; c < alumnos[f].length; c++) {
                if (c == (alumnos[f].length - 1)) {
                    System.out.println("El promedio es: " + alumnos[f][c]);
                } else {
                    System.out.print(alumnos[f][c] + "  ");
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------------------\n");

    }
    
}

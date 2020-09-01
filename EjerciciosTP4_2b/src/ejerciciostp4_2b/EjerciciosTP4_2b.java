package ejerciciostp4_2b;

import java.util.Scanner;

public class EjerciciosTP4_2b {

    public static void main(String[] args) {

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("1.b) Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma, será necesario realizar un recorrido por la misma y mostrar los datos cargados por pantalla.\n");

        String razasDePerros [][] = new String [3][3];

        Scanner teclado5 = new Scanner(System.in);

        for (int f = 0; f < razasDePerros.length; f++) {
            for (int c = 0; c < razasDePerros[f].length; c++) {
                System.out.print("Ingrese nombre de raza " + (c+1) + ": ");
                razasDePerros[f][c] = teclado5.next();
            }
        }

        System.out.println("\n\nDatos cargados en matriz: \n");

        for (int f = 0; f < razasDePerros.length; f++) {
            for (int c = 0; c < razasDePerros[f].length; c++) {
                System.out.print(razasDePerros[f][c] + "  ");
                if(c == (razasDePerros[f].length - 1)) {
                    System.out.print("\n");
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------------------\n");

    }
    
}

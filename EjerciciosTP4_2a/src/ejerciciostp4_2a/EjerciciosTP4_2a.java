package ejerciciostp4_2a;

import java.util.Scanner;

public class EjerciciosTP4_2a {

    public static void main(String[] args) {

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

    }
    
}

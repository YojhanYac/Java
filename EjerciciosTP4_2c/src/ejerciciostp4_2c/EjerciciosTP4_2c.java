package ejerciciostp4_2c;

import java.util.Scanner;

public class EjerciciosTP4_2c {

    public static void main(String[] args) {

        System.out.println("\n-------------------------------------------------------------------------\n");

        System.out.println("2.c) En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. Cada fila corresponde a las notas y al promedio de cada alumno.");

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

        System.out.print("\n");

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

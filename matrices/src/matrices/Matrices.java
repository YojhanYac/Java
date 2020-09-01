package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        double notas[][] = new double[4][4];

        for (int i = 0; i < 4; i++) {

            System.out.println("Ingrese las notas del alumno " + (i+1));
            Scanner teclado = new Scanner(System. in);

            for (int j = 0; j < 3; j++) {

                notas[i][j] = teclado.nextDouble();

            }
        }

        double suma;

        for (int i = 0; i < 4; i++) {

            suma = 0;

            for (int j = 0; j < 3; j++) {

                suma = suma + notas [i][j];
            }

            notas [i][3] = suma / 3;
        }

        
        for (int i = 0; i < 4; i++) {

            System.out.println("Las notas del alumno " + (i+1) + " fueron: ");

            for (int j = 0; j < 3; j++) {

                System.out.println("Nota " + (j+1) + " : " + notas[i][j]);

            }

            System.out.println("El promedio es: " + notas[i][3]);

        }

    }

}

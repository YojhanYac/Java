package ejerciciostp4_1e;

import java.util.Scanner;

public class EjerciciosTP4_1e {

    public static void main(String[] args) {

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

            System.out.print("\nIngrese el nombre de la " + (i+1) + posicion1[i] + " ciudad: ");
            // ciudades [i] = teclado4.nextLine();
            ciudades [i] = teclado4.next();
            System.out.print("Ingrese la temperatura mínima registrada de " + ciudades [i] + ": ");
            temperaturasMinimas[i] = teclado4.nextDouble();
            System.out.print("Ingrese la temperatura máxima registrada de " + ciudades [i] + ": ");
            temperaturasMaximas[i] = teclado4.nextDouble();

            if(i == 0) {
                    temperaturaMasBaja = temperaturasMinimas[i];
                    temperaturaMasAlta = temperaturasMaximas[i];
            } else {
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
        }
        System.out.println("\n\nLa ciudad con temperatura más alta es " + ciudades[ciudadConTemperaturaMasAlta] + " con " + temperaturaMasAlta + "°\nLa ciudad con temperatura más baja es " + ciudades[ciudadConTemperaturaMasBaja] + " con " + temperaturaMasBaja + "°");

        System.out.println("\n-------------------------------------------------------------------------\n");

    }
    
}

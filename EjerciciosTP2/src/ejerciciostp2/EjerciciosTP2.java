package ejerciciostp2;

import java.util.Scanner;

public class EjerciciosTP2 {

    public static void main(String[] args) {

    /* Ejercicio No 1: Errores en Netbeans
        Nota: Para que compile correctamente, deberá comentar las lineas 27 y 33, ya que contienen errores realizados siguiendo la consigna para responderla.
        1) Probar realizar las operaciones que se citan a continuación en el IDE Netbeans. Registrar los errores obtenidos y responder a las preguntas citadas.*/
    
        // a.Declarar una variable de tipo entero, otra de tipo double y otra de tipo String.

            int variableEntera;
            double variableDouble;
            String variableString;

        // b.Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo double. ¿Existe un error? ¿Se puede hacer esta operación?

            variableEntera = 12;
            variableDouble = variableEntera;

            //No existe error, los enteros forman parte de los valores que puede tomar una variable del tipo double, se puede realizar pero no es una buena forma de administrar memoria
        
        // c.Asignar un valor a la variable de tipo double y asignar esta última a la variable de tipo entero. ¿Existe un error? ¿Se puede hacer esta operación?

            variableDouble = 258.26;
            // variableEntera = variableDouble;

            //Existe error, las variables del tipo int solo pueden recibir contener enteros, al asignarle un valor double no es compatible, se puede realizar un casteo teniendo en cuenta el redondeo que se necesita.

        // d.Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se puede hacer esta operación?

            // variableString = 35;

            //Existe error, la variable String solo recibe cadenas de texto o caracteres, no se le pueden asignar un número, se puede ingresar el valor como cadena de texto con comillas dobles y luego, si se necesita convertirlo a entero nuevamente

        // e.Si quiero almacenar el número 48 en la variable String. ¿Cómo debo realizar la asignación?

            variableString = "48";
            //Deberá ingresar el valor entre comillas, asi tendra en la cadena de texto el número.

        //Ejercicio No 2: Condicionales

            System.out.println("-------------------------------------------------------------------------\n");

            System.out.println("1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.\na) Los repositores cobran $15.890 + un bono de 10%.\nb) Los cajeros cobran $25.630,89 fijos.\nc) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.\nSe necesita un programa que, dependiendo el tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo.");

            System.out.println("\nPrograma para calcular sueldo correspondiente\nIngrese el tipo de puesto:");
            Scanner teclado = new Scanner(System.in);
            String tipoDePuesto = teclado.nextLine();
            Double sueldoTotal;

            switch(tipoDePuesto){
                case "repositor":
                    sueldoTotal = 15890 * 1.1;
                    System.out.println("Le corresponde un sueldo de: " + sueldoTotal);
                    break;
                case "cajero":
                    sueldoTotal = 25630.89;
                    System.out.println("Le corresponde un sueldo de: " + sueldoTotal);
                    break;
                case "supervisor":
                    sueldoTotal = 35560.20 - (35560.20 * 0.11);
                    System.out.println("Le corresponde un sueldo de: " + sueldoTotal);
                    break;
                default:
                    System.out.println("Ingrese un puesto válido, repositor, cajero ó supervisor");
                    break;
            }

            System.out.println("\n-------------------------------------------------------------------------\n");

            System.out.println("2) Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo de esta realiza los siguientes controles:\na) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos.\nb) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un mensaje que el costo de envío es de $200.\nc) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje de que el envío es gratuito.\nRealizar un programa para llevar a cabo los 3 controles citados.\n");

            System.out.println("Ingrese la cantidad de paquetes que necesita comprar:");
            Scanner teclado1 = new Scanner(System.in);
            int cantidadProductos = teclado1.nextInt();

            if (cantidadProductos < 5) {
                System.out.println("El valor ingresado de productos no es válido, no se permiten compras inferiores a 5 productos");
            } else {
                if (cantidadProductos >= 5 && cantidadProductos <= 15) {
                    System.out.println("El costo de envío para la cantidad de productos ingresada es de $200");
                } else {
                    if (cantidadProductos >= 5 && cantidadProductos > 15) {
                        System.out.println("El costo de envío para la cantidad ingresada de productos es gratuito!");
                    }
                }
            }

            System.out.println("\n-------------------------------------------------------------------------\n");
    }
    
}

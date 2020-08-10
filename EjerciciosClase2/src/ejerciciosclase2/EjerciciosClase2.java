package ejerciciosclase2;

import java.util.Scanner;

public class EjerciciosClase2 {

    public static void main(String[] args) {

        //Ejercicio N° 3: Variables

        //------------------------ Ejercicio A ------------------------//
        System.out.println("3)\na.Un chico de primaria necesita realizar un algoritmo para dar valores a tres números. Decidió llamar a las variables num1, num2 y num3 y colocarles los valores 5, 3 y 7. Sin embargo, no sabe de qué tipos de datos deberían ser sus tres variables ni tampoco como asignar dichos valores. Realizar un programa que declare las variables y les asigne los valores que el chico necesita para cumplir con su tarea.");

        int num1 = 5, num2 = 3, num3 = 7;

        System.out.println("Los valores son:\nnum1: " + num1 + "\nnum2: " + num2 + "\nnum3: " + num3);


        //------------------------ Ejercicio B ------------------------//
        System.out.println("\nb.Una estudiante está dando sus primeros pasos en la programación y quiere realizar un programa que permita calcular cualquier porcentaje de un número. Para ello necesita que el usuario ingrese por teclado el número a calcular el porcentaje (por ejemplo 2500) y también el porcentaje que se desea calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10). A partir de estos valores, necesita que el algoritmo calcule el porcentaje (multiplicar el primer número por el valor del porcentaje), lo guarde en una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar el programa?");

        System.out.println("Ingrese un número para calcular su porcentaje: ");

        Scanner numeroIn = new Scanner(System.in);
        int numero = numeroIn.nextInt();

        System.out.println("Ingrese un valor de porcentaje (siendo 0% = 0,0 y 100% = 1,0) que desea calcular de " + numero + " :");

        Scanner porcentajeIn = new Scanner(System.in);
        Double porcentaje = porcentajeIn.nextDouble();
        Double resultado = numero * porcentaje;

        System.out.println("El " + porcentaje*100 + "% (" + porcentaje + ")" + " de " + numero + " es: " + resultado);


        //------------------------ Ejercicio C ------------------------//
        System.out.println("\nc.Un comerciante realiza 5 ventas por día. Necesita de un programa que le permita ingresar por teclado los montos de las 5 ventas y luego sumar el total de todas ellas para mostrar por pantalla el resultado. ¿Podrías ayudarlo a realizar el programa?");

        Double venta1, venta2, venta3, venta4, venta5;

        System.out.println("Ingrese el número de monto de la venta 1:");
        Scanner venta1In = new Scanner(System.in);
        venta1 = venta1In.nextDouble();

        System.out.println("Ingrese el número de monto de la venta 2:");
        Scanner venta2In = new Scanner(System.in);
        venta2 = venta2In.nextDouble();

        System.out.println("Ingrese el número de monto de la venta 3:");
        Scanner venta3In = new Scanner(System.in);
        venta3 = venta3In.nextDouble();

        System.out.println("Ingrese el número de monto de la venta 4:");
        Scanner venta4In = new Scanner(System.in);
        venta4 = venta4In.nextDouble();

        System.out.println("Ingrese el número de monto de la venta 5:");
        Scanner venta5In = new Scanner(System.in);
        venta5 = venta5In.nextDouble();

        Double resultado1 = venta1 + venta2 + venta3 + venta4 + venta5;
        System.out.println("El resultado de la suma de los montos es: " + resultado1);


        //------------------------ Ejercicio D ------------------------//
        System.out.println("\nd.Realizar un programa que calcule el IVA de un producto. Para esto, el usuario debe poder ingresar por teclado el valor del producto y el programa debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA es igual al 21% (0,21).");

        Double valorProducto;

        System.out.println("Ingrese el precio del producto para calcular el valor de IVA: ");
        Scanner valorProductoIn = new Scanner(System.in);
        valorProducto = valorProductoIn.nextDouble();

        System.out.println("El valor de IVA para el producto de " + valorProducto + " es: " + (valorProducto * 0.21));


        //------------------------ Ejercicio E ------------------------//
        System.out.println("\ne.Realizar un programa que permita a un profesor calcular el promedio de un alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del mismo(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es la suma de todas las notas dividido la cantidad, en el ejemplo sería: (8+7+9.50+10)/4.");

        Double nota1, nota2, nota3, nota4;

        System.out.println("Ingrese la primer nota:");
        Scanner nota1In = new Scanner(System.in);
        nota1 = nota1In.nextDouble();

        System.out.println("Ingrese la segunda nota:");
        Scanner nota2In = new Scanner(System.in);
        nota2 = nota2In.nextDouble();

        System.out.println("Ingrese la tercer nota:");
        Scanner nota3In = new Scanner(System.in);
        nota3 = nota3In.nextDouble();

        System.out.println("Ingrese la cuarta nota:");
        Scanner nota4In = new Scanner(System.in);
        nota4 = nota4In.nextDouble();

        System.out.println("El promedio de las cuatro notas ingresadas es: " + ((nota1 + nota2 + nota3 + nota4) / 4));


        //------------------------ Ejercicio F ------------------------//
        System.out.println("\nf.Realizar un programa que permita calcular el área de un triángulo. Se recuerda que la fórmula para calcular el área de un triángulo es: (base * altura) / 2. Se debe permitir al usuario ingresar la base y la altura, mientras que el programa debe calcular el área y mostrar el resultado por pantalla.");

        Double base, altura;

        System.out.println("Ingrese la base del triangulo para calcular el área:");
        Scanner baseIn = new Scanner(System.in);
        base = baseIn.nextDouble();

        System.out.println("Ingrese la altura del triangulo para calcular el área:");
        Scanner alturaIn = new Scanner(System.in);
        altura = alturaIn.nextDouble();

        System.out.println("El área del triangulo es: " + ((base * altura) / 2));


        //------------------------ Ejercicio G ------------------------//
        System.out.println("\ng.Realizar un programa que permita intercambiar el valor de dos variables. Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar un valor a una variable se sobrescribe el valor anterior.");

        Double variable1;
        Double variable2;
        Double aux;

        System.out.println("Ingrese el valor de la variable1:");
        Scanner variable1In = new Scanner(System.in);
        variable1 = variable1In.nextDouble();

        System.out.println("Ingrese el valor de la variable2:");
        Scanner variable2In = new Scanner(System.in);
        variable2 = variable2In.nextDouble();

        aux = variable1;
        variable1 = variable2;
        variable2 = aux;

        System.out.println("Se intercambiaron los valores, variable1: " + variable1 + " y variable2: " + variable2);
    }

}

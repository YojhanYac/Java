package condicionales;

public class Condicionales {

    public static void main(String[] args) {
        
        //prueba de la estructura if con dos bloques

        int suma = 0; 
        int num = 5;
        int resta = 0;
        String bloqueif = "NINGUNO";
        
        //pregunto si mi número es mayor a 3

        if (num > 3) {

            suma = num + num;
            System.out.println (suma);
            bloqueif = "IF";
        } else {
            
            resta = 15 - num;
            System.out.println (resta);
            bloqueif = "ELSE";
        }
        
        switch (num) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            default:
                System.out.println("Caso default");
                break;
        }

        //imprimo el número de bloque al que entré

        System.out.println ("El bloque de if al que entré fue el: " + bloqueif);
    }
}

package practicaeliabeolah;

import java.util.ArrayList;

public class CalculosMatematicos {

    public CalculosMatematicos() {
    }

    //No entiendo la lógica del código, la parte más dificil hasta ahora personalmente.
    public void calculosRefactorizados(int numero) {

        // Calculamos los factoriales primos
        ArrayList<Integer> miArray = new ArrayList();
        boolean primo = false; //me inquieta que se llame noEsPrimo, lo he cambiado

        //Añadimos el 1
        miArray.add(1);

        // ------------------------------------------------------
        
        /*
        //Qué ocurre si el numero pasado como argumento fuera menor que la condición del bucle?
        for (int i = 2; i < numero; i++) {
            primo = false;
            j = 2;
            //bucle while no se va a ejecutar dado que j es igual a 2 e i también
            while (j < i) {
                if (i % j == 0) {
                    primo = true;
                    j = i;
                } else {
                    j++;
                }
            }
            //Tremendo lío, mar de dudas
            if (!primo && numero % i == 0) {
                miArray.add(i);
            }
        }
         */
        
        // ------------------------------------------------------
        
        for (int i = 2; i < numero; i++) {
            primo = false;
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = true;
                    break; // Sale del bucle al encontrar un numero que sea primo
                }
            }
            if (!primo && numero % i == 0) {
                miArray.add(i);
            }
        }

        System.out.println("Los factoriales primos del número  introducido son: " + miArray);

        boolean esPrimo = true; //
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " SI es primo");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }
    }
}

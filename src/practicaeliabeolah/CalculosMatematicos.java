package practicaeliabeolah;

import java.util.ArrayList;

public class CalculosMatematicos {

    public CalculosMatematicos() {
    }

    //No entiendo la l�gica del c�digo, la parte m�s dificil hasta ahora personalmente.
    public void calculosRefactorizados(int numero) {

        // Calculamos los factoriales primos
        ArrayList<Integer> miArray = new ArrayList();
        boolean primo = false; //me inquieta que se llame noEsPrimo, lo he cambiado

        //A�adimos el 1
        miArray.add(1);

        // ------------------------------------------------------
        
        /*
        //Qu� ocurre si el numero pasado como argumento fuera menor que la condici�n del bucle?
        for (int i = 2; i < numero; i++) {
            primo = false;
            j = 2;
            //bucle while no se va a ejecutar dado que j es igual a 2 e i tambi�n
            while (j < i) {
                if (i % j == 0) {
                    primo = true;
                    j = i;
                } else {
                    j++;
                }
            }
            //Tremendo l�o, mar de dudas
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

        System.out.println("Los factoriales primos del n�mero  introducido son: " + miArray);

        boolean esPrimo = true; //
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El n�mero " + numero + " SI es primo");
        } else {
            System.out.println("El n�mero " + numero + " NO es primo");
        }
    }
}

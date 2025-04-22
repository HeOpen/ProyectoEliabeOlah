package practicaeliabeolah;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el n√∫mero sobre el que hacer los c·lculos");

        int numero;

        try {

            numero = sc.nextInt();

        } catch (Exception e) {

            System.out.println("El dato introducido no es un n˙mero");

            return;

        }

        

        System.out.println("Introduzca el n√∫mero sobre el que hacer los c√°lculos");


        CalculosMatematicos misCalculosMatematicos = new CalculosMatematicos();
        misCalculosMatematicos.calculosRefactorizados(numero);


    }

}

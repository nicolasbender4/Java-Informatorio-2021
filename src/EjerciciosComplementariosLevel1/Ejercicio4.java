package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*
* Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
* */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial = 1, numero = 0;
        System.out.println("Ingrese un número para hacer el Factorial: ");
        numero = entrada.nextInt();
        entrada.close();
        for (int x = 1; x <= numero; x++){
            factorial = factorial * x;
        }
        System.out.println("El Factorial del numero ingresado es: " + factorial);
    }
}

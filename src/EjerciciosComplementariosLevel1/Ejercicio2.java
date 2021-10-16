package EjerciciosComplementariosLevel1;

/*
Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el 
resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de 
ambos números.
*/
import java.util.Scanner;

public class Ejercicio2 {
	/* Ejercicio Complementario 2 */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int num1, num2, suma, resta, multiplicacion, resto = 0;
            float division = 0;
            System.out.println("Ingrese un número: ");
            num1 = entrada.nextInt();
            System.out.println("Ingrese otro número: ");
            num2 = entrada.nextInt();
            entrada.close();
            
            suma = num1 + num2;
            resta = num1 - num2;
            multiplicacion = num1 * num2;
            division = num1 / num2;
            resto = num1 % num2;

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            System.out.println("Resto: " + resto);
    }

}

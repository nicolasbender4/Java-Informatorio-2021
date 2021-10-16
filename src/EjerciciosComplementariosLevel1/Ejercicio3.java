package EjerciciosComplementariosLevel1;
/*
*  Confeccionar un programa que dado un número entero como dato de entrada imprima la
* secuencia de números (incrementos de 1) de la siguiente forma:

 * */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        entrada.close();
        for(int x = 0; x < numero; x++){
            for(int y = 0; y <= x; y++) {
                System.out.print(y + 1 + " ");
            }
            System.out.println();
        }
    }

}

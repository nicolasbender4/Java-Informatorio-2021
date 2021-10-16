package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*
* Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por
* sumas sucesivas (sin uso de librerías).
* */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, suma = 0;
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = entrada.nextInt();
        entrada.close();
        if (num1 != 0 && num2 != 0) {
            for (int x = 1; x <= num2; x++) {
                suma = suma + num1;
            }

        }else{
            suma = 0;
        }
        System.out.println("La multiplicación con sumas sucesivas es " + suma);
    }
}

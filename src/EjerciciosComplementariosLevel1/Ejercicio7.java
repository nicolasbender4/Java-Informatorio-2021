package EjerciciosComplementariosLevel1;

/*
Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo 
a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
*/

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args){
        //  Ingreso Palabra
        System.out.println("Ingrese una palabra: ");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        entrada.close();
        //  Separo en un arreglo las letras
        char[] letras = palabra.toCharArray();

        for (char i : letras) {
            int valor = (int) i;
            if (valor >= 97 && valor < 122){
                valor = valor - 32;
                System.out.println((char) valor);
            } else{
                System.out.println((char) valor);
            }
        }
    }
}

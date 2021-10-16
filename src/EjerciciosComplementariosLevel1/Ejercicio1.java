package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        System.out.println("Ingrese nombre de Usuario: ");
        usuario = entrada.nextLine();
        entrada.close();
        System.out.println("HOLA " + usuario);
    }
}

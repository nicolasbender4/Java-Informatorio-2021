import java.util.Scanner;

/*
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreApellido, edad, direccion, ciudad = "";
        System.out.print("Ingrese Nombre y Apellido: ");
        nombreApellido = entrada.nextLine();
        System.out.print("Ingrese edad: ");
        edad = entrada.nextLine();
        System.out.print("Ingrese Dirección: ");
        direccion = entrada.nextLine();
        System.out.print("Ingrese Ciudad: ");
        ciudad = entrada.nextLine();
        entrada.close();

        System.out.println("Valores ingresados");
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido);
        
    }
}

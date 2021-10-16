import java.util.Scanner;

/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
 de potencia (sin uso de librerías).
 */
public class Ejercicio6{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int potencia = 1, num1, num2;
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese Potencia: ");
        num2 = entrada.nextInt();
        entrada.close();

        if(num1 == 0){
            potencia = 0;
        }else if(num2 == 0){
            potencia = 1;
            }else{
                for(int x = 1; x <= num2; x++){
                    potencia = potencia * num1;
                }
            } 
        System.out.println("La potencia con sumas sucesivas es: " + potencia);  
    }
}

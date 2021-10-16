import java.util.Scanner;

/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        char letra;
        int contadorLetra = 0;

        System.out.println("Ingrese Texto: ");
        texto = entrada.nextLine();
        System.out.print("Ingrese letra a contar: ");
        letra = entrada.next().charAt(0);
        entrada.close();

        for(int x=0; x < texto.length(); x++){
            if(texto.charAt(x) == letra){
               contadorLetra++;
            }
        }
        System.out.println("Cantidad de Letras " + letra + ": " + contadorLetra);
    }
}

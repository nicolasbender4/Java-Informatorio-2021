package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los 
valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso 
(reverse), desordenar (mezclar) el arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la 
operación sort (mezclar) aleatoriamente? Idem para el reverso
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> cartas = new ArrayList<>();
        String[] palos = {"Corazones" ,"Diamantes","Trébol","Pica"};

        //  Cargo Cartas y armo el Mazo.
        for (String palo : palos ) {
            for(int x = 1; x <=13 ; x++ ){
                String carta = x + " " + palo;
                cartas.add(carta);
            }            
        }
        //  Mazo Ordenado  
        System.out.println("Mazo ordenado");
        System.out.println(cartas);

        //  Mazo al Revés
        System.out.println("Mazo Al Revés");
        Collections.reverse(cartas);
        System.out.println(cartas);

        //  Mazo Desordenado
        System.out.println("Mazo Desordenado");
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }
}

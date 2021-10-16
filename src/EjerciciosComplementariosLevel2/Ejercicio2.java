package Complementarios2;

import java.util.ArrayList;

/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio 
de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista
 y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        int cantNumAntes, cantNumDespues = 0;

        //  Agrego elementos al arragle
        enteros.add(5);
        enteros.add(13);
        enteros.add(2);
        enteros.add(10);
        enteros.add(8);

        //  Cantidad de Números del arreglo ANTES de agregar
        cantNumAntes = enteros.size();        
        //  Agrega Elemento "1" al INICIO
        enteros.add(0, 1);
        //  Agrega Elemento "4" al FINAL
        enteros.add(enteros.size()-1, 4);
        //  Cantidad de Números del arreglo DESPUES de agregar
        cantNumDespues = enteros.size();
        //  Imprime Elementos
        for(int x=0; x < enteros.size(); x++){
            System.out.println("Posición " + x + ": " + enteros.get(x));
        }
        //  Imprime Tamaño ANTES de agregar elementos
        System.out.println("Tamaño del arreglo antes de agregar elementos: " + cantNumAntes);
        //  Imprime Tamaño DESPUES de agregar elementos
        System.out.println("Tamaño del arreglo después de agregar elementos: " + cantNumDespues);
    }


}

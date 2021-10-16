package Complementarios2;

import java.util.ArrayList;

/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
luego imprimir por pantalla el ranking
*/
public class Ejercico1 {
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<>();
        cadena.add("Mar del Plata");
        cadena.add("Tandil");
        cadena.add("Resistencia");

        for (int x = 0; x < cadena.size(); x++){
            System.out.println("#" + (x+1) + " - " + cadena.get(x));
        }
    }
}

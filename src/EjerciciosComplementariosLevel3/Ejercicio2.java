package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado
  //    de aplicar la operación de potencia a 2.
public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        System.out.println(calcularPotenciaLista(palabras));
    }

    private static List<Integer> calcularPotenciaLista(List<Integer> pal){
        return pal.stream()
                .map(p -> (int)(Math.pow(p, 2)))
                .collect(Collectors.toList());
    }
}

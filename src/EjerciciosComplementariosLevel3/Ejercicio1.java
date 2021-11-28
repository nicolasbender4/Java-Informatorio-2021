package EjerciciosComplementariosLevel3;
//  Dada una lista que contiene valores de tipo String, se deberá filtrar
//  todos los valores que NO sean null o vacío ("").

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        System.out.println(calcularPalabrasNoNulas(palabras));
    }

    private static List<String> calcularPalabrasNoNulas(List<String> palabras){
        return palabras.stream()
                .filter(Objects::nonNull)
                .filter(pal -> !pal.equals(""))
                .collect(Collectors.toList());
    }
}

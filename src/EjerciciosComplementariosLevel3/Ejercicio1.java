package EjerciciosComplementariosLevel3;

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
        List<String> palabrasNoNulas = palabras.stream()
                .filter(Objects::nonNull)
                .filter(pal -> !pal.equals(""))
                .collect(Collectors.toList());
        System.out.println(palabrasNoNulas);
    }
}

package EjerciciosComplementariosLevel3;
/*
Se dispone de una lista de Strings, de la cual saber la cantidad de valores
 que comiencen con la letra B (tanto mayúscula como minúscula, en ese caso
 decimos que será ignoreCase).
 */
import java.awt.datatransfer.StringSelection;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(calcularPalabrasComienzanConB(palabras));
    }

    private static int calcularPalabrasComienzanConB(List<String> palabras) {
        return palabras.stream()
                .filter(pal -> pal.toLowerCase().startsWith("b"))
                .collect(Collectors.toList()).size();

    }
}

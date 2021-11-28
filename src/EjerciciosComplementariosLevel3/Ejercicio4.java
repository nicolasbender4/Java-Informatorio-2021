package EjerciciosComplementariosLevel3;
/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando
la operación de factorial pero no se desean valores repetidos.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        System.out.println(calcularFactorial(palabras));
    }

    private static List<Integer> calcularFactorial(List<Integer> palabras) {
        return palabras.stream()
                .distinct()
                .map(num -> factorial(num))
                .collect(Collectors.toList());
    }
    public static Integer factorial(Integer numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}

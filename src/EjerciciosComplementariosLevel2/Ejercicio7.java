package EjerciciosComplementariosLevel2;
/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array
de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2
colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y  el segundo con qué valor
debe frenar (no se incluye en el cálculo).
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4.
 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {

    public static void main(String[] args) {
        //  Llamo a la Función completaValoresEntre() Y muestro lo que devuelve
        System.out.println(completaValoresEntre());
    }
    private static List<String> completaValoresEntre() {
        List<String> listaNumeros = new ArrayList<>();
        //  Pruebo con rango de valores entre 5 y 20
        for (int x = 5; x <= 20; ++x) {
            //  Pasa a string el valor de "x"
            String posicion = String.valueOf(x);
            //  Comparo si es multiplo de 2 o de 3 o de los 2.
            if ((x % 2 == 0) && (x % 3 == 0)) {
                posicion = "FizzBazz";
            }else if (x % 2 == 0) {
                posicion = "Fizz";
            }else if (x % 3 == 0) {
                posicion = "Buzz";
            }
            listaNumeros.add(posicion);
        }
        return listaNumeros;
    }
}

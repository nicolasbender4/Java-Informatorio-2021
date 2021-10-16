package EjerciciosComplementariosLevel2;

/*:
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de
horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total
final a cobrar.

Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = Arrays.asList(6, 7, 8, 4, 5);
        List<Integer> valorPorHora = Arrays.asList(350, 345, 550, 600, 320);
        List<Integer> totales = new ArrayList<>();
        int horasPesos, totalPesos = 0;

        //  Calculo horas trabajadas
        for(int x=0; x<5; x++){
            horasPesos = horasTrabajadas.get(x) * valorPorHora.get(x);
            totales.add(x, horasPesos);
        }
        //  Muestro horas totales
        for(int x = 0; x <5; x++){
            System.out.print(totales.get(x) + " ");
            totalPesos += totales.get(x);
        }
        //  Muestro total pesos
        System.out.println("\nPesos a cobrar: " + totalPesos);
    }
}

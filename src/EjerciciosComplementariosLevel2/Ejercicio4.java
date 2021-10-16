package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        //  Defino arreglo Alumnos
        List<String> alumnos = new ArrayList<>();

        //  Agrego Elementos
        alumnos.add("Marcela");
        alumnos.add("Pedro");
        alumnos.add("José");
        alumnos.add("Nicolás");
        alumnos.add("Ariel");
        alumnos.add("Mariana");
        alumnos.add("Vaneza");
        alumnos.add("Marcelo");
        alumnos.add("María del Carmen");
        alumnos.add("Evaristo");
        alumnos.add("Michel");
        alumnos.add("Juan Cruz");

        //  Separo Alumnos
        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);

        //  Muestro Cursos
        System.out.println("Alumnos del Curso 1");

        for (var lista1 : curso1) {
            System.out.println(lista1);
        }
        System.out.println("--------------------------------");
        System.out.println("Alumnos del Curso 2");


        for (var lista2 : curso2) {
            System.out.println(lista2);
        }
        System.out.println("--------------------------------");
        System.out.println("Alumnos del Curso 3");

        for (var lista3 : curso3) {
            System.out.println(lista3);
        }
    }
}

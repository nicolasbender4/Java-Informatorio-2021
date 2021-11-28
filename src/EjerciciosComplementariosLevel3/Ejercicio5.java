package EjerciciosComplementariosLevel3;
/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento
(con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map
será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar
su funcionamiento.
En ejemplo se muestra solo con 1 Alumno a modo de abreviar
En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar
 otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpons", LocalDate.now().minusYears(30)),
                                        new Alumno("Carlos", "Maidana", LocalDate.parse("1999-01-30")),
                                        new Alumno("Roberto", "Sanchez", LocalDate.parse("1997-05-02")),
                                        new Alumno("Rocío", "Ovideo", LocalDate.parse("2000-12-21")),
                                        new Alumno("Jose", "Perez", LocalDate.parse("1998-09-16")),
                                        new Alumno("Andrea", "Villalba", LocalDate.parse("1999-04-01")),
                                        new Alumno("Marcelo", "Ordoñez", LocalDate.parse("1997-03-06")),
                                        new Alumno("Patricia","Muriega", LocalDate.parse("1999-01-25")));

        System.out.println(getMapNombreEdad(alumnos));
    }
    private static Map<String, Integer> getMapNombreEdad(List<Alumno> alumnos) {
        return alumnos.stream()
                .collect(Collectors
                        .toMap(a -> ("\"" + a.getApellido() + " " + a.getNombre() + "\""),
                                a -> getEdad(a.getFechaDeNacimiento())));
    }
    private static Integer getEdad(LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}

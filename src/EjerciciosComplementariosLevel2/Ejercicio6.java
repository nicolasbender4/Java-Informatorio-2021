package EjerciciosComplementariosLevel2;
    /*
Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido - DNI - horasTrabajadas - valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario)
donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args){
        //  Defino Diccionario de Empleados
        Map<Integer, Integer> diccionarioEmpleados = new HashMap<>();
        //  Defino Lista de Empleados
        Set<Empleados> listaEmpleados = new HashSet<>();
        //  Instancio Empleados
        listaEmpleados.add(new Empleados("Marcelo Sosa", 95678345, 5, 235));
        listaEmpleados.add(new Empleados("Julieta Gomez", 90983423, 9, 195));
        listaEmpleados.add(new Empleados("Joaquín Martina", 92334455, 6, 320));
        //  Recorro Lista de Empleados y agrego al Diccionario: clave(DNI) y sueldo(calcularSueldo)
        for (Empleados empleados : listaEmpleados) {
            //  Calculo Sueldo total de empleado
            Integer calcularSueldo = empleados.getHorasTrabajadas() * empleados.getValorPorHora();
            //  Cargo Diccionario
            diccionarioEmpleados.put(empleados.getDni(), calcularSueldo);
        }
        //  Muestro Valores
        System.out.println(diccionarioEmpleados);
    }
}

class Empleados {
    //  Defino atributos privados
    private String nombreYApellido;
    private Integer dni, horasTrabajadas, valorPorHora;
    //  Defino clase Empleados
    public Empleados (String nombreYApellido, Integer dni, Integer horasTrabajadas, Integer valorPorHora){
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    //  Métodos (Getters)
    public Integer getDni() {
        return this.dni;
    }
    public Integer getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
    public Integer getValorPorHora() {
        return this.valorPorHora;
    }
}


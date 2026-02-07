package edu.alejandra.pena.actividad3.process;

import edu.alejandra.pena.actividad3.data.Empleado;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * En esta clase vamos a realizar distintas operaciones para nuestra lista de empleados
 */

public class EmpleadoManager {
    /**
     * vamos a encontrar y devolver al empleado que cuenta con el mayor salario de la lista
     *
     * @return para devolver al empleado con el mayor salario
     */

    public Empleado obtenerMayorSalario(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return null;
        Empleado mayorSalario = emps.get(0);
        for (int i = 1; i < emps.size(); i++) {
            if (emps.get(i).getSalario() > mayorSalario.getSalario()) {
                mayorSalario = emps.get(i);
            }
        }
        return mayorSalario;
    }

    /**
     * Vamos a determinar cual es la edad que se repite más veces de la lista de empleados
     * Usamos @return para devolver la edad más común
     */

    public int edadMasComun(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return 0;

        Map<Integer, Integer> frecuencias = new HashMap<>();

        for (Empleado emp : emps) {
            int edad = emp.getEdad();
            if (frecuencias.containsKey(edad)) {
                frecuencias.put(edad, frecuencias.get(edad) + 1);
            } else {
                frecuencias.put(edad, 1);
            }
        }

        int maxFrecuencia = -1;
        int edadComun = -1;

        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                edadComun = entry.getKey();
            }
        }

        return edadComun;
    }

    /**
     * Vamos a encontrar el promedio entre la edad de los empleados de la lista
     *
     * @return para devolver el promedio de las edades de todos los empleados
     *
     */
    public double obtenerPromedioEdad(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return 0;
        int sumaEdades = 0;
        for (Empleado emp : emps) {
            sumaEdades += emp.getEdad();
        }

        return (double) sumaEdades / emps.size();
    }

    /**
     * Se va a calcular el promedio entre los salarios de los empleados de la lista
     * @return el promedio del salario
     */

    public double obtenerPromedioSalario(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return 0;
        double sumaSalarios = 0;
        for (Empleado emp : emps) {
            sumaSalarios += emp.getSalario();
        }
        return sumaSalarios / emps.size();
    }

    /**
     * Se va a calcular el promedio de la edad de todos los empleados de la lista que ganen arroba de 25k
     * @return el promedio de la edad de los empleados ganando +25k
     */

    public double obtenerPromedioEdadSalarioMas25k(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return 0;
        double sumaEdades = 0;
        int contador = 0;
        for (Empleado emp : emps) {
            if (emp.getSalario() > 25000) {
                sumaEdades += emp.getEdad();
                contador++;
            }
        }
        if (contador == 0) return 0;
        return sumaEdades / contador;
    }

    /**
     * Vamos a crear una lista nueva que contenga a todos los empleados que sean menores de 25 años
     * utilizaremos @return empleados con una edad menor a 25
     */

    public List<Empleado> filtrarMenoresDe25Anios(List<Empleado> emps) {
        List<Empleado> menoresDe25 = new ArrayList<>();
        for (Empleado emp : emps) {
            if (emp.getEdad() < 25) {
                menoresDe25.add(emp);
            }
        }
        return menoresDe25;
    }

    /**
     * Se va a revisar cuantos de los empleados permanecen al equipo de sistemas
     * @return para el numero de empleados que hay en sistemas
     */

    public int obtenerEmpleadosSistemas(List<Empleado> emps) {
        if (emps == null) return 0;
        int contador = 0;
        for (Empleado emp : emps) {
            if (emp.getDepartamento().equalsIgnoreCase("sistemas")) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Una lista de empleados que devuelva al empleado que tenga el mayor salario y que sea mayor de 30 años
     * @return para el empleado de +30 años con mayor salario,
     */

    public Empleado obtenerEmpleadoMayorSalarioMayor30Anios(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return null;
        Empleado empleadoMayorSalarioMayor30 = null;
        for (Empleado emp : emps) {
            if (emp.getEdad() > 30) {
                // En este pedazo del código escoge al primer empleado que tenga 30 años o más, la segunda parte analiza si el nuevo empleado gana más que el primero
                if (empleadoMayorSalarioMayor30 == null || emp.getSalario() > empleadoMayorSalarioMayor30.getSalario())
                    empleadoMayorSalarioMayor30 = emp;
            }
        }
        return empleadoMayorSalarioMayor30;
    }

    /**
     * Aqui vamos a buscar al empleado que tenga el menor salario de la lista y que su edad sea la menos común entre todas
     * @return al empleado con el menor salario y la edad menos común
     */

    public Empleado obtenerMenorSalarioEdadMenosComun(List<Empleado> emps) {
        if (emps == null || emps.isEmpty()) return null;

        // 1. Aqui es en donde se cuentan las frecuencias en las edades
        Map<Integer, Integer> frec = new HashMap<>();
        for (Empleado emp : emps) frec.put(emp.getEdad(), frec.getOrDefault(emp.getEdad(), 0) + 1);

        // 2. En esta parte es en donde se va a encontrar la frecuencia mínima
        int minFrec = Integer.MAX_VALUE;
        for (int f : frec.values()) if (f < minFrec) minFrec = f;

        // 3. Ultima parte, se busca al de menor salario entre todos los que tienen esa frecuencia mínima
        Empleado resultado = null;
        for (Empleado emp : emps) {
            if (frec.get(emp.getEdad())== minFrec) {
                if (resultado == null || emp.getSalario() < resultado.getSalario()) {
                    resultado = emp;
                }
            }
        }
        return resultado;
    }
}

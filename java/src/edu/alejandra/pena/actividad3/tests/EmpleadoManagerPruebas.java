package edu.alejandra.pena.actividad3.tests;

import edu.alejandra.pena.actividad3.data.Empleado;
import edu.alejandra.pena.actividad3.process.EmpleadoManager;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * En esta clase vamos a crear los test para nuestra clase de empleados
 */


public class EmpleadoManagerPruebas {
    private EmpleadoManager manager;
    private List<Empleado> empleados;

    @Before
    public void setUp() {
        manager = new EmpleadoManager();
        empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 25, 30000, "Sistemas"));
        empleados.add(new Empleado("Maria", 30, 40000, "Administración"));
        empleados.add(new Empleado("Pedro", 25, 25000, "Sistemas"));
        empleados.add(new Empleado("Ana", 35, 50000, "RH"));
        empleados.add(new Empleado("Luis", 24, 28000, "Ventas"));
        empleados.add(new Empleado("André", 21, 45000, "RH"));

    }

    @Test
    public void testObtenerMayorSalario() {
        Empleado mayorSalario = manager.obtenerMayorSalario(empleados);
        assertEquals("Ana", mayorSalario.getNombre());
        assertEquals(50000, mayorSalario.getSalario(), 0.01);

    }

    @Test
    public void testEdadMasComun() {
        // edades: 25, 30, 25, 35, 24 y 21, la edad que se repite más veces es el 25, con un total de 2 veces
        int edadMasComun = manager.edadMasComun(empleados);
        assertEquals(25, edadMasComun);
    }

    @Test
    public void testObtenerPromedioEdad() {
        double promedioEdad = manager.obtenerPromedioEdad(empleados);
        assertEquals(26.666, promedioEdad, 0.01);

    }

    @Test
    public void testObtenerPromedioSalario() {
        double promedioSalario = manager.obtenerPromedioSalario(empleados);
        assertEquals(36333.333, promedioSalario, 0.01);
    }

    @Test
    public void testObtenerPromedioEdadSalarioMas25k() {
        double promedioEdadSalarioMas25k = manager.obtenerPromedioEdadSalarioMas25k(empleados);
        assertEquals(27.0, promedioEdadSalarioMas25k, 0.01);
    }

    @Test
    public void testFiltrarMenoresDe25Anios() {
        List<Empleado> empleadosMenoresDe25 = manager.filtrarMenoresDe25Anios(empleados);
        // Menores de 25 (< 25): Luis(24), André(21). Juan y Pedro tienen 25 exactos.
        assertEquals(2, empleadosMenoresDe25.size());
    }

    @Test
    public void testObtenerEmpleadosSistemas() {
        int empleadosSistemas = manager.obtenerEmpleadosSistemas(empleados);
        // Sistemas: Juan, Pedro
        assertEquals(2, empleadosSistemas);
    }

    @Test
    public void testObtenerEmpleadoMayorSalarioMayor30Anios() {
        Empleado empleadoMayorSalarioMayor3Anios = manager.obtenerEmpleadoMayorSalarioMayor30Anios(empleados);
        // Mayor de 30 (> 30): Ana (35). Maria tiene 30 exactos.
        assertEquals("Ana", empleadoMayorSalarioMayor3Anios.getNombre());
        assertEquals(50000, empleadoMayorSalarioMayor3Anios.getSalario(), 0.01);
    }

    @Test
    public void testObtenerMenorSalarioEdadMenosComun() {
        Empleado empleadoMenorSalarioEdadMenosComun = manager.obtenerMenorSalarioEdadMenosComun(empleados);
        assertEquals("Luis", empleadoMenorSalarioEdadMenosComun.getNombre());
        assertEquals(24, empleadoMenorSalarioEdadMenosComun.getEdad());
    }
}

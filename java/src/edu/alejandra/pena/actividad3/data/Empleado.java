package edu.alejandra.pena.actividad3.data;

/**
 * En esta clase vamos a conseguir los nombres, edades, salarios y departamentos de los empleados, con los datos vamos a crear una lista para poder resolver los siguientes métodos
 * @return los datos de los empleados 8nombre, edad, salario y departamento)
 */

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
}

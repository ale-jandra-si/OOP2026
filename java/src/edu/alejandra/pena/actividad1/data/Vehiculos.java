package edu.alejandra.pena.actividad1.data;

public class Vehiculos {
    private String modelo;
    private double precio;
    private String caracteristicas;

    public Vehiculos(String modelo, double precio, String caracteristicas) {
        this.modelo = modelo;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
    }
    public double getPrecio() { return precio; }
    public String getModelo() { return modelo; }
    public String getCaracteristicas() { return caracteristicas; }

    @Override
    public String toString() {
        return modelo + "($" + precio + ") - " + caracteristicas;
    }
}

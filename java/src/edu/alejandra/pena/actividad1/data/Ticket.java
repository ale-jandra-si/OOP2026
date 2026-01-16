package edu.alejandra.pena.actividad1.data;

 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
 import java.util.ArrayList;
 import java.util.List;

public class Ticket {
    private String nombreCliente;
    private List<Vehiculos> autosComprados;
    private LocalDateTime fecha;

    public Ticket(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.autosComprados = new ArrayList<>();
        this.fecha = LocalDateTime.now();
    }

    public void agregarAUTO(Vehiculos auto) {
        autosComprados.add(auto);
    }

    public double calcularTotal() {
        return autosComprados.stream().mapToDouble(Vehiculos::getPrecio).sum();
    }

    public void imprimirTicket() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("\n========= TICKET DE VENTA =========");
        System.out.println("Fecha: " + fecha.format(formatter));
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("-----------------------------------");
        for (Vehiculos v : autosComprados) {
            System.out.println("- " + v.getModelo() + ": $" + v.getPrecio());
        }
        System.out.println("-----------------------------------");
        System.out.println("TOTAL A PAGAR: $" + calcularTotal());
        System.out.println("===================================\n");
    }
}

package edu.alejandra.pena.actividad1.ui;

import edu.alejandra.pena.actividad1.data.Ticket;
import edu.alejandra.pena.actividad1.data.Vehiculos;
import edu.alejandra.pena.actividad1.process.Cliente;
import java.util.Scanner;

public class CLI {
    public static void iniciarPrograma() {
        Scanner sc = new Scanner(System.in);
        Cliente gestor = new Cliente();

        System.out.println("--- BIENVENIDO ---");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        Ticket ticket = new Ticket(nombre);
        boolean comprando = true;

        while (comprando) {
            System.out.println("\nVehículos en exhibición:");
            for (int i = 0; i < gestor.getInventario().size(); i++) {
                System.out.println((i + 1) + ". " + gestor.getInventario().get(i));
            }
            System.out.println("0. Finalizar compra y generar ticket");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if (opcion > 0 && opcion <= gestor.getInventario().size()) {
                Vehiculos elegido = gestor.getInventario().get(opcion - 1);
                ticket.agregarAUTO(elegido);
                System.out.println("¡" + elegido.getModelo() + " añadido al carrito!");
            } else if (opcion == 0) {
                comprando = false;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        ticket.imprimirTicket();
        System.out.println("Gracias por su compra.");
    }
}

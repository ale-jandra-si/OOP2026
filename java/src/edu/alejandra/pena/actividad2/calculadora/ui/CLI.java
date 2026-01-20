package edu.alejandra.pena.actividad2.calculadora.ui;


import edu.alejandra.pena.actividad2.calculadora.process.*;
import java.util.Scanner;
import edu.alejandra.pena.actividad2.calculadora.process.Division;
import edu.alejandra.pena.actividad2.calculadora.process.Logaritmo;
import edu.alejandra.pena.actividad2.calculadora.process.Modulo;
import edu.alejandra.pena.actividad2.calculadora.process.Multiplicacion;
import edu.alejandra.pena.actividad2.calculadora.process.Potencia;
import edu.alejandra.pena.actividad2.calculadora.process.Raiz;
import edu.alejandra.pena.actividad2.calculadora.process.Resta;
import edu.alejandra.pena.actividad2.calculadora.process.Suma;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Despliega el menú principal y gestiona la interacción con el usuario.
     */
    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n======= CALCULADORA ARITMÉTICA =======");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz");
            System.out.println("8. Logaritmo");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            // Validar que el usuario ingrese un número
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                procesarOperacion(opcion);
            } else if (opcion != 9) {
                System.out.println("\n>>> Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 9);

        System.out.println("¡Hasta luego!");
    }

    /**
     * Solicita datos y ejecuta la operación según la opción elegida.
     */
    private static void procesarOperacion(int opcion) {
        int a, b, resultado = 0;
        String nombreOp = "";

        // Casos especiales de nombres de parámetros
        if (opcion == 6) { // Potencia
            System.out.print("Ingrese la base: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el exponente: ");
            b = scanner.nextInt();
        } else if (opcion == 7) { // Raíz
            System.out.print("Ingrese el índice (ej. 2 para cuadrada): ");
            a = scanner.nextInt();
            System.out.print("Ingrese el radicando: ");
            b = scanner.nextInt();
        } else if (opcion == 8) { // Logaritmo
            System.out.print("Ingrese la base: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el operando: ");
            b = scanner.nextInt();
        } else {
            System.out.print("Ingrese el primer número: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            b = scanner.nextInt();
        }

        switch (opcion) {
            case 1: resultado = Suma.realizarOperacion(a, b); nombreOp = "Suma"; break;
            case 2: resultado = Resta.realizarOperacion(a, b); nombreOp = "Resta"; break;
            case 3: resultado = Multiplicacion.realizarOperacion(a, b); nombreOp = "Multiplicación"; break;
            case 4: resultado = Division.realizarOperacion(a, b); nombreOp = "División"; break;
            case 5: resultado = Modulo.realizarOperacion(a, b); nombreOp = "Módulo"; break;
            case 6: resultado = Potencia.realizarOperacion(a, b); nombreOp = "Potencia"; break;
            case 7: resultado = Raiz.realizarOperacion(a, b); nombreOp = "Raíz"; break;
            case 8: resultado = Logaritmo.realizarOperacion(a, b); nombreOp = "Logaritmo"; break;
        }

        System.out.println("\nResultado de la " + nombreOp + ": " + resultado);
    }
}

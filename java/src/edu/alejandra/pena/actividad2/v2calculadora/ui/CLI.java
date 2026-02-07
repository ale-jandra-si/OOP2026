package edu.alejandra.pena.actividad2.v2calculadora.ui;

import edu.alejandra.pena.actividad2.v2calculadora.process.Calculadora;
import java.util.Scanner;

public class CLI {
    /**
     * Esta clase es en la que se desarrolla todo el código, en esta se ve desarrollado el menú, la opción para salir, etc
     */

    private static Calculadora calculadora= new Calculadora();

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean ejecutando = true;

        while(ejecutando) {
            showMenu();
            opcion = scanner.nextInt();

            if(opcion == 9) {
                ejecutando = false;
                System.out.println("Saliendo del programa...");
                continue;
            }

            try {
                calculadora.setOperacion(opcion);
                aplicarOperacion(calculadora);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Hasta luego");
    }

    public static void aplicarOperacion(Calculadora calculadora) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo valor");
        int b = scanner.nextInt();
        int resultado = calculadora.operacion.apply(a,b);
        System.out.println("El resultado es: " +resultado);
    }

    public static void showMenu() {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: Potencia");
        System.out.println("5: División");
        System.out.println("6: Raíz");
        System.out.println("7: Logaritmo");
        System.out.println("8: Modulo");
        System.out.println("9: Salir");
    }
}

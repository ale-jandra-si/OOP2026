package edu.alejandra.pena.actividad2.v2calculadora.process;

public class Calculadora {

    /**
     * En esta clase es en donde se desarolla la calculadora, aquí se encuentra el switch para poder realizar las operaciones
     * IllegalArgumentException para cuando el usuario ingresa una opción no valida
     */

    public Operacion operacion;

    public void setOperacion(int opcion) {

        this.operacion = getOperacion(opcion);
    }

    private Operacion getOperacion(int opcion) {
        return switch(opcion) {
            case 1 -> new Suma();
            case 2 -> new Resta();
            case 3 -> new Multiplicacion();
            case 4-> new Potencia();
            case 5 -> new Division();
            case 6 -> new Raiz();
            case 7 -> new Logaritmo();
            case 8 -> new Modulo();
            default -> throw new  IllegalArgumentException("Opción no valida, intente de nuevo");
        };
    }
}

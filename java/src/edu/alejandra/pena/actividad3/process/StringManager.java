package edu.alejandra.pena.actividad3.process;

/**
 * En esta clase vamos a resolver distintas operaciones que se manejen a base de strings
 */

public class StringManager {
    /**
     * Vamos a ver si una cadena de texto corresponde a un palíndromo (se puede leer igual de izquierda a derecha y viceversa)
     * @return si es palíndromo o no
     */

    public boolean esPalindromo(String cadena) {
        String limpio = cadena.replace (" ", "").toLowerCase();
        int izquierda = 0;
        int derecha = limpio.length() - 1;
        while (izquierda < derecha) {
            if (limpio.charAt(izquierda) != limpio.charAt(derecha)) return false;
            izquierda++;
            derecha--;

        }
        return true;
    }

    /**
     * Para este método tenemos que recibir un string y devolver un número de vocales
     * @return número de vocales
     */

    public int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                contador++;
            }

        }
        return contador;
    }

    /**
     * Tenemos que invertir una cadena sin utilizar el método reverse
     * @return cadena invertida
     */

    public String invertirCadena(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);

        }
        return invertida;
    }

    /**
     * Tenemos que encontrar la primera ubicación de un caracter dentro de una cadena
     * No debemos utilizar Sting.indexOf()
     * @return primera posición del caracter
     */

    public int encontrarPrimeraUbicacion(String texto, char caracter) {
        if (texto == null) return -1;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                return i;
            }
        }
        return -1;
    }
}

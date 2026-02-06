package edu.alejandra.pena.actividad3.test;
import edu.alejandra.pena.actividad3.process.StringManager;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringManagerPruebas {
    private final StringManager manager = new StringManager();

    @Test
    public void testEsPalindromo() {
        assertTrue(manager.esPalindromo("anita lava la tina"));
        assertTrue(manager.esPalindromo("reconocer"));
        assertFalse(manager.esPalindromo("hola"));
    }

    @Test
    public void testContarVocales() {
        assertEquals(4, manager.contarVocales("Hola Mundo"));
        assertEquals(3, manager.contarVocales("AEI"));
        assertEquals(1, manager.contarVocales("xyzabsh"));
    }

    @Test
    public void testInvertirCadena() {
        assertEquals("aloh", manager.invertirCadena("hola"));
        assertEquals("ana", manager.invertirCadena("ana"));
        assertEquals("", manager.invertirCadena(""));
    }

    @Test
    public void testEncontrarPrimeraUbicacion() {
        assertEquals(1, manager.encontrarPrimeraUbicacion("hola", 'o'));
        assertEquals(0, manager.encontrarPrimeraUbicacion("java", 'j'));
        assertEquals(-1, manager.encontrarPrimeraUbicacion("mundo", 'z'));
    }

}

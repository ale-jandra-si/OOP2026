package edu.alejandra.pena.actividad3.test;

import edu.alejandra.pena.actividad3.process.ListaManager;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaManagerPruebas {

    private ListaManager manager;

    @Test
    public void testMoverCeros() {
        manager = new ListaManager();
        int[] entrada = {0, 2, 4, 0, 18};
        int[] salida = manager.moverCeros(entrada);
        assertArrayEquals(new int[]{2, 4, 18, 0, 0}, salida);
    }

    @Test
    public void testContarPares() {
        manager = new ListaManager();
        int[] entrada = {6, 2, 14, 4, 22};
        int salida = manager.contarPares(entrada);
        assertEquals(5, salida);
    }
}

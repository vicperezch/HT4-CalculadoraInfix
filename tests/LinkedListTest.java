package tests;

import src.LinkedList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

/**
 * @author Victor Pérez
 * @since 19/02/2024
 * Clase que contiene las pruebas para la lista encadenada
 */
public class LinkedListTest {

    /**
     * Test 1: Obtener un elemento cuando la lista está vacía
     */
    @Test
    public void gettingElement() {
        LinkedList<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.search(3));
    }

    
    /**
     * Test 2: Añadir un elemento en un índice especificado
     */
    @Test
    public void addingElementAtTheMiddle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5, 2);
        assertEquals(5, (int) list.search(2));
    }


    /**
     * Test 3: Eliminar un elemento en un índice especificado
     */
    @Test
    public void removingElementAtTheMiddle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);
        assertEquals(4, (int) list.search(2));
    }
}

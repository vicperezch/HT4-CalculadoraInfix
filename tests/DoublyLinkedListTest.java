package tests;

import src.DoublyLinkedList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

/**
 * @author Victor Pérez
 * @since 19/02/2024
 * Clase que contiene las pruebas para la lista encadenada
 */
public class DoublyLinkedListTest {
    
    /**
     * Test 1: Añadir un elemento fuera de rango
     */
    @Test
    public void AddingElementOutOfRange() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 5));
    }


    /**
     * Test 2: Añadir un elemento al inicio de la lista
     */
    @Test
    public void AddingElementAtTheBeginning() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.add(4, 0);
        assertEquals(4, (int) list.search(0));
    }


    /**
     * Test 3: Eliminar un elemento al final
     */
    @Test
    public void RemovingElementAtTheEnd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.remove(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.search(2));
    }
}

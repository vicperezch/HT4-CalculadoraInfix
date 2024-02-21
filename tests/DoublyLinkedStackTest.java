package tests;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase con los tests para el stack que trabaja con listas doblemente encadenadas
 */
import src.DoublyLinkedStack;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.*;

public class DoublyLinkedStackTest {
 
    /**
     * Test 1: Obtener el último valor de un stack
     */
    @Test
    public void popingLastElementOutOfStack() {
        DoublyLinkedStack<Integer> myStack = new DoublyLinkedStack<Integer>();
        myStack.push(5);
        myStack.push(2);
        myStack.push(3);
        assertEquals(3, myStack.pop());
    }

    /**
     * Test 2: Obtener un valor nulo de un stack vacío
     */
    @Test
    public void popingAndNextIsNull() {
        DoublyLinkedStack<Integer> myStack = new DoublyLinkedStack<Integer>();
        assertNull(myStack.pop());
    }
}

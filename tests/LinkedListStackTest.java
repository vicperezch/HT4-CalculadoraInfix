package tests;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase con los tests para el stack que trabaja con listas encadenadas
 */
import src.LinkedListStack;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.*;

public class LinkedListStackTest {
    
    /**
     * Test 1: Obtener el último valor de un stack
     */
    @Test
    public void popingLastElementOutOfStack(){
        LinkedListStack<Integer> myStack = new LinkedListStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(3, (int) myStack.pop());
    }

    /**
     * Test 2: Obtener un valor nulo de un stack vacío
     */
    @Test
    public void popingOnEmptyListIsNull() {
        LinkedListStack<Integer> myStack = new LinkedListStack<Integer>();
        assertNull(myStack.pop());
    }
}

package tests;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase con los tests para el stack que trabaja con vectores
 */
import src.VectorStack;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.*;

public class VectorStackTest {
    
    /**
     * Test 1: Obtener el último valor de un stack
     */
    @Test
    public void popingLastElementOutOfStack() {
        VectorStack<Integer> myStack = new VectorStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(3, (int) myStack.pop());
    }

    /**
     * Test 2: Obtener un valor nulo de un stack vacío
     */
    @Test
    public void popingOnEmptyListIsNull(){
        VectorStack<Integer> myStack = new VectorStack<Integer>();
        assertNull(myStack.pop());
    }
}

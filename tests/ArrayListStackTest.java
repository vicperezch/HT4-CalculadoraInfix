package tests;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase con los tests para el stack que trabaja con arraylists
 */
import src.ArrayListStack;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.*;

public class ArrayListStackTest {
    
    /**
     * Test 1: Obtener el último valor de un stack
     */
    @Test
    public void popingLastElementOutOfStack(){
        ArrayListStack<Integer> myStack = new ArrayListStack<Integer>();
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
        ArrayListStack<Integer> myStack = new ArrayListStack<Integer>();
        assertNull(myStack.pop());
    }
}

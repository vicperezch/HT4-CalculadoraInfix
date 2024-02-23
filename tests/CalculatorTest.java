package tests;

import src.Calculator;
import src.VectorStack;
import src.ArrayListStack;
import src.IStack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Victor Pérez
 * @since 23/02/2024
 * Clase que contiene los métodos de prueba para la calculadora
 */
public class CalculatorTest {
    
    /**
     * Test 1: Convertir una expresión infix a postfix
     */
    @Test
    public void convertInfixToPostfix() {
        Calculator calculator = Calculator.getCalculator();
        IStack<Character> stack = new VectorStack<>();

        String infix = "(1 + 2) * 9";
        String result = calculator.convertToPostix(stack, infix);

        assertEquals("12+9*", result);
    }

    /**
     * Test 2: Evaluar una expresión postfix
     */
    @Test
    public void evaluatePostfix() {
        Calculator calculator = Calculator.getCalculator();
        IStack<Integer> stack = new ArrayListStack<>();

        String postfix = "24^5+7-2/";
        int result = calculator.evaluatePostfix(stack, postfix);

        assertEquals(7, result);
    }
}

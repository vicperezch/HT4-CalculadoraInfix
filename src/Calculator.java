package src;

/**
 * @author Victor Pérez
 * @since 22/02/2024
 * Clase que traduce y evalúa las expresiones infix
 */
public class Calculator {
    private static Calculator instance;

    /**
     * Constructor de clase
     */
    private Calculator() {}

    /**
     * Obtiene la única instancia de la clase y la crea si no existe
     * @return Instancia de la clase Calculator
     */
    public static Calculator getCalculator() {
        if (instance == null) {
            instance = new Calculator();
        }

        return instance;
    }

    /**
     * Convierte una expresión infix a postfix
     * @param stack Implementación de la pila a utilizar
     * @param infix Expresión infix a convertir
     * @return String con la expresión postfix
     */
    public String convertToPostix(IStack<String> stack, String infix) {
        stack.push("#");
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix += c;

            } else if (c == '(') {
                stack.push(String.valueOf(c));

            } else if (c == '^') {
                stack.push(String.valueOf(c));

            } else if (c == '*' || c == '/') {
                stack.push(String.valueOf(c));

            } else if (c == '+' || c == '-') {
                stack.push(String.valueOf(c));

            } else if (c == ')') {
                

            } else {
                postfix += c;
            }
        }

        return postfix;
    }
}

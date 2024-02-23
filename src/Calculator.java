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
    public String convertToPostix(IStack<Character> stack, String infix) {
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (c != ' ') {
                if (Character.isDigit(c)) {
                    postfix.append(c);

                } else if (c == '(') {
                    stack.push(c);

                } else if (c == '^') {
                    stack.push(c);

                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }

                    stack.pop();

                } else {
                    while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence((stack.peek()))) {
                        postfix.append(stack.pop());
                    }

                    stack.push(c);
                }
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }


    /**
     * Retorna el valor de un operador en la jerarquía
     * @param operator Operador a evaluar
     * @return Valor de precedencia
     */
    public int getPrecedence(char operator) {
        if (operator == '^') {
            return 3;

        } else if (operator == '*' || operator == '/') {
            return 2;

        } else if (operator == '+' || operator == '-') {
            return 1;
        }

        return 0;
    }


    /**
     * Opera una expresión postfix
     * @param stack Implementación de la pila a utilizar
     * @param postfix Expresión postfix a evaluar
     * @return Resultado de la operación
     */
    public int evaluatePostfix(IStack<Integer> stack, String postfix) {
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));

            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;

                    case '^':
                        stack.push((int) Math.pow(a, b));
                        break;
                }
            }
        }

        return stack.pop();
    }
}

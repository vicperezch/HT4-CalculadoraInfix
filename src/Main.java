package src;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nils Muralles & Victor Pérez
 * @since 19/02/2024
 * Clase principal que ejecuta el programa e interactúa con el usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        Reader data = new Reader("datos.txt");
        Calculator calc = Calculator.getCalculator();

        while (menu) {
            System.out.println("\n---CALCULADORA INFIX---");
            System.out.println("1. Stack por ArrayList");
            System.out.println("2. Stack por Vector");
            System.out.println("3. Stack por LinkedList");
            System.out.println("4. Stack por DoublyLinkedList");
            System.out.println("5. Salir");
            System.out.print("¿Qué implementación del Stack deesea utilizar? ");

            try {
                int op = input.nextInt();
                input.nextLine();

                if (op >= 1 && op <= 4) {
                    IStack<Character> stack = StackFactory.generateStack(op);
                    IStack<Integer> intStack = StackFactory.generateStack(op);
                    String expressionInfix = data.readFile();
                    String postfixExpression = calc.convertToPostix(stack, expressionInfix);
                    int result = calc.evaluatePostfix(intStack, postfixExpression);
                    System.out.println("El resultado es: " + result);
            
                } else if (op == 5) {
                    menu = false;
                }

            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("\nDebe seleccionar un número");
            }
        }

        input.close();
    }
}
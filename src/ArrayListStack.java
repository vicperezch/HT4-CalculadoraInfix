package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase personalizada que modela una pila que trabaja con ArrayLists
 */
import java.util.ArrayList;

public class ArrayListStack<T> implements IStack<T>{
    private ArrayList<T> stack = new ArrayList<T>();
    
    /**
     * Agrega un nuevo dato a la pila
     * @param value Valor a añadir
     */
    @Override
    public void push(T value) {
        stack.add(value);
    }

    /**
     * Elimina el último elemento en la pila y lo devuelve
     * @return Elemento eliminado
     */
    @Override
    public T pop() {
        if (!isEmpty()) {
            T lastValue = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return lastValue;
        }
        return null;
    }

    /**
     * Devuelve el último elemento de la pila sin eliminarlo
     * @return Último elemento de la pila
     */
    @Override
    public T peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    /**
     * Comprueba si la pila está vacía
     */
    @Override
    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
}

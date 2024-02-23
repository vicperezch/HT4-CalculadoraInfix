package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase personalizada que modela una pila que trabaja con listas doblemente encadenadas
 */
public class DoublyLinkedStack<T> implements IStack<T> {
    private DoublyLinkedList<T> stack = new DoublyLinkedList<T>();

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
            T lastValue = stack.search(stack.size() - 1);
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
            T lastValue = stack.search(stack.size() - 1);
            return lastValue;
        }
        return null;
    }

    /**
     * Comprueba si la pila está vacía
     */
    @Override
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}

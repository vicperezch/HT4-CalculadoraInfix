package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase personalizada que modela una pila que trabaja con listas encadenadas
 */
public class LinkedListStack<T> implements IStack<T> {
    private LinkedList<T> stack = new LinkedList<T>();

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
        if (stack.size() != 0) {
            T lastValue = stack.search(stack.size() - 1);
            stack.add(null, stack.size() - 1);
            return lastValue;
        }
        return null;
    }
    
}

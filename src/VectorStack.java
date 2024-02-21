package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase personalizada que modela una pila que trabaja con Vectores
 */
import java.util.Vector;

public class VectorStack<T> implements IStack<T> {
    private Vector<T> stack = new Vector<T>();

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
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }
    
}

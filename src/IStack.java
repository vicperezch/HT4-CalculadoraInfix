package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Interfaz con los métodos de los stack
 */
public interface IStack<T> {
    public void push(T value);
    public T pop();
}

package src;

/**
 * @author Victor Pérez
 * @since 19/02/2024
 * Interfaz que contiene los métodos de una lista
 */
public interface IList<T> {
    public void add(T value);

    public void add(T value, int index);

    public void remove(int index);
    
    public T search(int index);

    public int size();
}

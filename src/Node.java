package src;

/**
 * @author Victor Pérez
 * @since 19/02/2024
 * Clase que representa un nodo de la estructura de datos
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    /**
     * Constructor de clase
     * @param value Valor que se le asignará al nodo
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Retorna el valor almacenado en el nodo
     * @return Valor del nodo
     */
    public T getValue() {
        return value;
    }

    /**
     * Actualiza el valor almacenado en el nodo
     * @param value Nuevo valor del nodo
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Retorna el nodo siguiente
     * @return Nodo siguiente
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Actualiza el apuntador hacia el siguiente nodo
     * @param next Nuevo nodo siguiente
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}

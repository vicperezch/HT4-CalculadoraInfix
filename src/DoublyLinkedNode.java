package src;

public class DoublyLinkedNode<T> {
    private T value;
    private DoublyLinkedNode<T> next;
    private DoublyLinkedNode<T> previous;

    /**
     * Constructor de clase
     * @param value Valor que se le asignará al nodo
     */
    public DoublyLinkedNode(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
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
    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    /**
     * Actualiza el apuntador hacia el siguiente nodo
     * @param next Nuevo nodo siguiente
     */
    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }
    
    /**
     * Retorna el nodo anterior
     * @return Nodo anterior
     */
    public DoublyLinkedNode<T> getPrevious() {
        return previous;
    }

    /**
     * Actualiza el apuntador hacia el nodo anterior
     * @param previous Nuevo nodo anterior
     */
    public void setPrevious(DoublyLinkedNode<T> previous) {
        this.previous = previous;
    }
}

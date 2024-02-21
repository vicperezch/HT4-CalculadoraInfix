package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase personalizada que modela una pila que trabaja con listas encadenadas
 */
public class LinkedListStack<T> implements IStack<T> {
    private Node<T> firstNode;
    private Node<T> lastNode; 

    /**
     * Agrega un nuevo dato a la pila
     * @param value Valor a añadir
     */
    @Override
    public void push(T value) {
        if (lastNode == null) {
            lastNode = new Node<T>(value);
            firstNode = lastNode;

        } else {
            Node<T> current = new Node<T>(value);
            current.setNext(firstNode);
            firstNode = current;
        }
    }

    /**
     * Elimina el último elemento en la pila y lo devuelve
     * @return Elemento eliminado
     */
    @Override
    public T pop() {
        if (firstNode != null) {
            T valueFirst = firstNode.getValue();
            firstNode = firstNode.getNext();

            return valueFirst;

        } else {
            return null;
        }
    }
    
}

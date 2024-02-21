package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 21/02/24
 * Clase personalizada que modela una pila que trabaja con listas doblemente encadenadas
 */
public class DoublyLinkedStack<T> implements IStack<T> {
    private DoublyLinkedNode<T> firstNode;
    private DoublyLinkedNode<T> lastNode;

    /**
     * Agrega un nuevo dato a la pila
     * @param value Valor a añadir
     */
    @Override
    public void push(T value) {
        DoublyLinkedNode<T> temp = new DoublyLinkedNode<>(value);

        if (lastNode == null) {
            firstNode = temp;
            lastNode = firstNode;

        } else {
            lastNode.setNext(temp);
            temp.setPrevious(lastNode);
            lastNode = temp;
        }

    }

    /**
     * Elimina el último elemento en la pila y lo devuelve
     * @return Elemento eliminado
     */
    @Override
    public T pop() {
        if (firstNode != null) {
            DoublyLinkedNode<T> current = lastNode;
            T valueLast = lastNode.getValue();
            current.getPrevious().setNext(null);
            return valueLast;

        } else {
            return null;
        }
    }
    
}

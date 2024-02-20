package src;

/**
 * @author Victor Pérez
 * @since 19/02/2024
 * Clase que representa una lista doblemente encadenada
 */
public class DoublyLinkedList<T> implements IList<T> {
    private int length;
    private DoublyLinkedNode<T> firstNode;
    private DoublyLinkedNode<T> lastNode;


    /**
    * Constructor de clase
    */
    public DoublyLinkedList() {
        this.length = 0;
        this.firstNode = null;
        this.lastNode = null;
    }


    /**
     * Añade un nuevo elemento al final de la lista
     * @param value Valor a agregar
     */
    public void add(T value) {
        DoublyLinkedNode<T> temp = new DoublyLinkedNode<>(value);

        if (length == 0) {
            firstNode = temp;
            lastNode = firstNode;

        } else {
            lastNode.setNext(temp);
            temp.setPrevious(lastNode);
            lastNode = temp;
        }

        length++;
    }


    /**
     * Añade un nuevo elemento en el índice especificado
     * @param value Valor a agregar
     * @param index Índice donde se agrega el valor
     */
    public void add(T value, int index) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        DoublyLinkedNode<T> temp = new DoublyLinkedNode<>(value);
        if (index == 0) {
            temp.setNext(firstNode);
            firstNode.setPrevious(temp);
            firstNode = temp;

        } else if (index == length) {
            lastNode.setNext(temp);
            temp.setPrevious(lastNode);
            lastNode = temp;

        } else {
            DoublyLinkedNode<T> current = firstNode;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            temp.setNext(current.getNext());
            temp.setPrevious(current);
            current.getNext().setPrevious(temp);
            current.setNext(temp);
        }

        length++;
    }


    /**
     * Elimina el elemento en el índice especificado
     * @param index Índice del elemento a eliminar
     */
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            firstNode = firstNode.getNext();
            firstNode.setPrevious(null);

        } else if (index == length - 1) {
            lastNode = lastNode.getPrevious();
            lastNode.setNext(null);
        
        } else {
            DoublyLinkedNode<T> current = firstNode;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
            current.getNext().setPrevious(current);
        }

        length--;
    }


    /**
     * Retorna el valor almacenado en el índice especificado
     * @param index Índice del valor a retornar
     * @return Valor almacenado
     */
    public T search(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        DoublyLinkedNode<T> temp = lastNode;
        for (int i = length - 1; i > index; i--) {
            temp = temp.getPrevious();
        }

        return temp.getValue();
    }
}

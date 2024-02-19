package src;

/**
 * @author Victor Pérez
 * @since 19/02/2024
 * Clase que representa una lista encadenada
 */
public class LinkedList<T> implements IList<T> {
    private int length;
    private Node<T> firstNode;
    private Node<T> lastNode;


    /**
    * Constructor de clase
    */
    public LinkedList() {
        this.length = 0;
        this.firstNode = null;
        this.lastNode = null;
    }


    /**
     * Añade un nuevo elemento al final de la lista
     * @param value Valor a agregar
     */
    public void add(T value) {
        Node<T> temp = new Node<>(value);

        if (length == 0) {
            firstNode = temp;
            lastNode = firstNode;

        } else {
            lastNode.setNext(temp);
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

        Node<T> temp = new Node<>(value);
        if (index == 0) {
            temp.setNext(firstNode);
            firstNode = temp;

        } else if (index == length) {
            lastNode.setNext(temp);
            lastNode = temp;

        } else {
            Node<T> current = firstNode;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            temp.setNext(current.getNext());
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

        } else {
            Node<T> current = firstNode;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
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

        Node<T> temp = firstNode;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }

        return temp.getValue();
    }
}

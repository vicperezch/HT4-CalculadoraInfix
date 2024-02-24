package src;

/**
 * @author Nils Muralles 
 * @version 1.0.0
 * @since 23/02/24
 * Clase que implementa el patrón Factory para el uso de Stacks
 */
public class StackFactory<T> {
    public static <T> IStack<T> generateStack(int option){
        switch (option) {
            case 1:
                return new ArrayListStack<T>();
        
            case 2:
                return new VectorStack<T>();

            case 3:
                return new LinkedListStack<T>();

            case 4:
                return new DoublyLinkedStack<T>();

            default:
                return null;
        }
    }
}

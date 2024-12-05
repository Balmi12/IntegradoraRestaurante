package utez.edu.integradoraRestaurante.Utils;

// Clase Cola que implementa nodos enlazados
public class Queue<E> {
    // Clase nodo interna
    private static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    // Atributos de clase

    private Node<E> front; // En el stack solo tenemos el top
    private Node<E> rear;
    private int size;

    // Metodos de clase

        // Stack = push, List = add, Queue = offer
    public boolean offer (E data) {
        Node<E> newNode = new Node<>(data); // Encapsulamos el data

        if (rear != null) {
            rear.next = newNode;
        }

        rear = newNode;

        if (front == null) {
            front = newNode;
        }
        size++;
        return true;
    }

        // Stack = peek, List = get, Queue = peek
    public E peek () {
        return front == null ? null : front.data;
    }


        // Stack = pop, List = remove, Queue = poll
    public E poll () {
        if (isEmpty()) {
            // Depende de la implementacion
            return null;
        }
        E data = front.data;
        front = front.next;
        if (front == null) { // Si la cola queda vacia
            rear = null;
        }
        size--;
        return data;
    }


        // isEmpty
    public boolean isEmpty () {
        return front == null;
    }


        // size
    public int size () {
        return size;
    }
}

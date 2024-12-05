package utez.edu.integradoraRestaurante.Utils;

public class DoubleLinkedList<T> {
    // Nodos Dobles
     private class DoubleNode<T> {
        T data;
        DoubleNode next;
        DoubleNode previous;

        public DoubleNode(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }





    // 1) Atributos de clase
    DoubleNode<T> head;
    DoubleNode<T> tail;
    int size;

    // 2) Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // 3) Definir los metodos para jugar con los nodos
    // add
    public boolean add(T element) {
        if (size == 0) {
            head = new DoubleNode<T>(element);
            tail = head;
        } else { // Una lista siempre se inserta al final
            DoubleNode newNode = new DoubleNode<T>(element);
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode; // Actualizar la referencia
        }
        size++;
        return true;
    }

    // remove
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("El indice esta fuera de los limites de la lista, Tonto >:C");
        }
        DoubleNode<T> current;
        if (index == 0) {
            current = head;
            head = head.next; // Remover el primer nodo
            if (head != null) {
                head.previous = null;
            }
        } else if (index == size - 1) {
            current = tail;
            tail = tail.previous; // Remover el ultimo nodo
            if (tail != null) {
                tail.next = null;
            }
        } else {
            if (index < size / 2) {
                current = head;
                // Buscar el nodo en la primera mitad de la lista
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                // Buscar el nodo en la segunda mitad de la lista
                for (int i = size - 1; i > index; i--) {
                    current = current.previous;
                }
            }
            // Conectar los nodos anterior y siguiente para
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size --;
        return true;
    }

    // size
    public int size() {
        return size;
    }

    // get
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("El indice esta fuera de los limites de la lista, Tonto >:C");
        }
        DoubleNode<T> current;
        if (index < size / 2) {
            current = head;
            // Recorrrer desde el principio hasta el indice
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            // Recorrer desde el final hasta el indice deseado
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }
        return current.data;
    }
}

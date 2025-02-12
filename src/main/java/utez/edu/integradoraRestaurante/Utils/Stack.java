package utez.edu.integradoraRestaurante.Utils;// Pila (Clase) que usa lista enlazada simple

import java.util.EmptyStackException;

public class Stack<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    // Atributos
    private Node<E> top;
    private int size;

    // Constructor
    public Stack() {
        top = null;
        size = 0;
    }



    // Metodos
    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public E peek(){
        if(size==0) {
            throw new IllegalStateException("La pila esta vacia, tonti >:C");
        }
        return top.data;
    }

    public E pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        E data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

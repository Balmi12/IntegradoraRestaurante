package utez.edu.integradoraRestaurante.Utils;

public class ArrayListR<T> {
    // Atributos de clase
    private T[] array;
    private int size;
    private int capacity;

    // Constructor
    @SuppressWarnings("unchecked")
    public ArrayListR() {
        capacity = 10; // Puede ser cambiado
        array = (T[]) new Object[capacity];
        size = 0;
    }

    // Metodos que utilizan o juegan con el arreglo
        // El add es boolean porque la interfaz Collection asi lo define, y posteriormente queremos que nuestro
        // arrayList sea compatible con Java
    public boolean add(T element) {
        if (size == capacity) {
            // Entonces debemos poner mas capacidad
            resize();

        }
        array[size] = element;
        size++;
        return true;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        // Este metodo va a duplicar el tamaño de mi arrreglo usando el truco de la reasignacion de referencia
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        // Copiar lo que tenia el viejo arreglo en el nuevo
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Obtener algo de la lista por indice
    public T get(int index) {
        // Si es mayor o menor que el tamaño Exception
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("El indice esta fuera de los limites del arreglo, tonto >:(");
        }
        return array[index];
    }

    // MEtodo para eliminar un elemento de la lista, segun su indice
    public boolean remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("El indice esta fuera de los limites del arreglo, tonto >:(");
        }
        for (int i = index; i < size - 1; i++) {
            if (array[i+1] != null) {
                array[i] = array[i+1];
            }
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public void set(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("El indice esta fuera de los limites del arreglo, tonto >:(");
        }
        array[index] = element;
    }


}

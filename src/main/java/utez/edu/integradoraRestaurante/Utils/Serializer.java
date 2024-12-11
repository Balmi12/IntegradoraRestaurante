package utez.edu.integradoraRestaurante.Utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serializer<T> extends JsonSerializer<DoubleLinkedList<T>> {
    @Override
    public void serialize(DoubleLinkedList<T> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        List<T> list = new ArrayList<>();
        DoubleLinkedList<T>.DoubleNode<T> current = value.head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        gen.writeObject(list); // Serializa como una lista estándar
    }
}


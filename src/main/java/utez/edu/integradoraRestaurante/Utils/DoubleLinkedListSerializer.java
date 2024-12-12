package utez.edu.integradoraRestaurante.Utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import utez.edu.integradoraRestaurante.Utils.DoubleLinkedList;
import utez.edu.integradoraRestaurante.food.Food;

public class DoubleLinkedListSerializer extends JsonSerializer<DoubleLinkedList<Food>> {
    @Override
    public void serialize(DoubleLinkedList<Food> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartArray();
        for (int i = 0; i < list.size(); i++) {
            Food food = list.get(i);
            jsonGenerator.writeStartObject();
            jsonGenerator.writeNumberField("id", food.getId());
            jsonGenerator.writeStringField("name", food.getName());
            jsonGenerator.writeNumberField("price", food.getPrice());
            jsonGenerator.writeStringField("type", food.getType());
            jsonGenerator.writeStringField("image", food.getImage());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndArray();
    }
}
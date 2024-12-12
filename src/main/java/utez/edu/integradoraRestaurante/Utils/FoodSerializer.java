package utez.edu.integradoraRestaurante.Utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import utez.edu.integradoraRestaurante.food.Food;

import java.io.IOException;

public class FoodSerializer extends JsonSerializer<Food> {
    @Override
    public void serialize(Food food, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("id", food.getId());
        jsonGenerator.writeStringField("name", food.getName());
        jsonGenerator.writeNumberField("price", food.getPrice());
        jsonGenerator.writeStringField("type", food.getType());
        jsonGenerator.writeStringField("image", food.getImage());
        jsonGenerator.writeEndObject();
    }
}
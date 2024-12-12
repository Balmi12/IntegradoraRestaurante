package utez.edu.integradoraRestaurante.order.model;

import java.util.Random;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import utez.edu.integradoraRestaurante.Utils.DoubleLinkedList;

import utez.edu.integradoraRestaurante.Utils.DoubleLinkedListSerializer;
import utez.edu.integradoraRestaurante.customer.Customer;
import utez.edu.integradoraRestaurante.food.Food;


@Data
public class Order {


    private Long id;
    private Customer customer;

    @JsonSerialize(using = DoubleLinkedListSerializer.class)
    private DoubleLinkedList<Food> comidas = new DoubleLinkedList<>();
    private double total;

    public Order(Long id, Customer customer, DoubleLinkedList<Food> comidas, double total) {
        this.id = id;
        this.customer = customer;
        this.comidas = comidas;
        this.total = total;
    }

    public Order(Long id, Customer customer, DoubleLinkedList<Food> comidas) {
        this.id = id;
        this.customer = customer;
        this.comidas = comidas;
    }

    public Order(Long id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DoubleLinkedList<Food> getComidas() {
        return comidas;
    }

    public void setComidas(DoubleLinkedList<Food> comidas) {
        this.comidas = comidas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public double calcularTotal() {
        for (int i = 0; i < comidas.size(); i++) {
            this.total += comidas.get(i).getPrice();
        }
        return this.total;
    }

    
}

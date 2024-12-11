package utez.edu.integradoraRestaurante.order.controller;

import org.springframework.stereotype.Service;
import utez.edu.integradoraRestaurante.Utils.DoubleLinkedList;
import utez.edu.integradoraRestaurante.Utils.Queue;
import utez.edu.integradoraRestaurante.customer.Customer;
import utez.edu.integradoraRestaurante.food.Food;
import utez.edu.integradoraRestaurante.order.model.Order;

import java.util.Random;

@Service
public class OrderService {
    private final Queue<Order> orders = new Queue<>();
    private Long currentOrderId = 1L;
    private Random random = new Random();

    public Order crearPedido() {
        DoubleLinkedList<Food> foods = comidasAleatorias();
        Customer customer = clienteAleatorio();
        double total = 0.0;

        Order order = new Order(currentOrderId++, customer, foods, 0);
        total = order.calcularTotal();
        orders.offer(order);
        return order;
    }

    public Order procesarPedido () {
        return orders.poll();
    }

    public Order consultarPedido() {
        return orders.peek();
    }


    public Customer clienteAleatorio() {
        Customer[] customers = new Customer[10];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = Customer.values()[random.nextInt(Customer.values().length)];
        }
        return customers[random.nextInt(customers.length)];
    }

    public DoubleLinkedList<Food> comidasAleatorias() {
        Food[] foodsPool = new Food[5];
        for (int i = 0; i < foodsPool.length; i++) {
            foodsPool[i] = Food.values()[random.nextInt(Food.values().length)];
        }
        DoubleLinkedList<Food> foods = new DoubleLinkedList<>();
        for (int i = 0; i < 5; i++) {
            foods.add(foodsPool[i]);
        }
        return foods;
    }


}
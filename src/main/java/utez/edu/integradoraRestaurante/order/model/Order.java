package utez.edu.integradoraRestaurante.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import utez.edu.integradoraRestaurante.Utils.DoubleLinkedList;
import utez.edu.integradoraRestaurante.customer.Customer;
import utez.edu.integradoraRestaurante.food.Food;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "total")
    double total;

    
}

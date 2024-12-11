package utez.edu.integradoraRestaurante.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utez.edu.integradoraRestaurante.Utils.Queue;
import utez.edu.integradoraRestaurante.order.model.Order;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/new")
    public Order nuevoPedido() {
        return orderService.crearPedido();
    }



    @GetMapping("/poll")
    public Order procesar() {
        return orderService.procesarPedido();
    }

    @GetMapping("/peek")
    public Order consultar() {
        return orderService.consultarPedido();
    }
}

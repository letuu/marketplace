package pro.sky.spring.marketplace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring.marketplace.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
//в application.properties прописан путь context-path=/store
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam("id")List<Integer> idList) {
        this.orderService.addToCart(idList);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return this.orderService.getItems();
    }
}

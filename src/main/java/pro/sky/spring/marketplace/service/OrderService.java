package pro.sky.spring.marketplace.service;

import org.springframework.stereotype.Service;
import pro.sky.spring.marketplace.component.Cart;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {

    private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> idList) {
        cart.addToCart(idList);
    }

    public List<Integer> getItems() {
        return cart.getUserCart();
    }
}

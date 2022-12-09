package pro.sky.spring.marketplace.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> userCart = new ArrayList<>();

    public void addToCart(List<Integer> idList) {
        userCart.addAll(idList);
    }

    public List<Integer> getUserCart() {
        return Collections.unmodifiableList(userCart);
    }
}

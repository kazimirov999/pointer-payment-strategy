import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    ShoppingCart() {
        items = new ArrayList<>();
    }

    void addItem(Item item) {
        items.add(item);
    }

    void removeItem(Item item) {
        items.remove(item);
    }

    int calculateTotal() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getPrice();
        }
        return sum;
    }

    void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }
}

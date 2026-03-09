import java.util.*;

public class OrderQueue {

    Queue<Product> orders = new LinkedList<>();

    public void placeOrder(Product p) {

        orders.add(p);

    }

    public void processOrders() {

        System.out.println("Processing Orders...");

        while (!orders.isEmpty()) {

            System.out.println("Order completed: " + orders.poll());

        }
    }
}

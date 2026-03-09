import java.util.*;

public class CartStack {

    Stack<Product> cart = new Stack<>();

    public void add(Product p) {

        cart.push(p);
        System.out.println("Added to cart: " + p);

    }

    public void undo() {

        if (!cart.isEmpty())
            System.out.println("Removed: " + cart.pop());
        else
            System.out.println("Cart empty");

    }

    public void viewCart() {

        System.out.println("Cart Items:");

        for (Product p : cart)
            System.out.println(p);

    }
}

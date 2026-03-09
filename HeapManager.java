import java.util.*;

public class HeapManager {

    public static void showTopExpensive(ArrayList<Product> products) {

        PriorityQueue<Product> heap =
                new PriorityQueue<>((a, b) -> b.price - a.price);

        heap.addAll(products);

        System.out.println("Top Expensive Phones:");

        for (int i = 0; i < 3; i++) {

            if (!heap.isEmpty())
                System.out.println(heap.poll());

        }
    }
}

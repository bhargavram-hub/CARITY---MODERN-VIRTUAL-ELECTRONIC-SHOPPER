import java.util.*;

public class ElectroCartMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = ProductDatabase.getProducts();
        HashMap<String, Product> productMap =
                ProductDatabase.buildHashMap(products);

        CartStack cart = new CartStack();
        OrderQueue orders = new OrderQueue();

        while (true) {

            System.out.println("\n===== CARTIFY-MODERN VIRTUAL ELECTRONIC SHOPPER =====");

            System.out.println("1 View Products");
            System.out.println("2 Search Product (Hashing)");
            System.out.println("3 Sort Products by Price (Bubble Sort)");
            System.out.println("4 Binary Search by Price");
            System.out.println("5 Top 3 Expensive Phones (Heap)");
            System.out.println("6 Add Product to Cart");
            System.out.println("7 Undo Cart Action (Stack)");
            System.out.println("8 View Cart");
            System.out.println("9 Place Orders (Queue)");
            System.out.println("10 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    for (Product p : products)
                        System.out.println(p);
                    break;

                case 2:

                    System.out.print("Enter phone name: ");
                    String name = sc.nextLine().toLowerCase();

                    Product found = productMap.get(name);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Phone not found");

                    break;

                case 3:

                    SortingAlgorithms.bubbleSort(products);
                    System.out.println("Products sorted by price");

                    break;

                case 4:

                    System.out.print("Enter price: ");
                    int price = sc.nextInt();

                    Product result =
                            SearchAlgorithms.binarySearch(products, price);

                    if (result != null)
                        System.out.println(result);
                    else
                        System.out.println("Not found");

                    break;

                case 5:

                    HeapManager.showTopExpensive(products);

                    break;

                case 6:

                    System.out.print("Enter phone name: ");
                    String phone = sc.nextLine().toLowerCase();

                    Product p = productMap.get(phone);

                    if (p != null)
                        cart.add(p);
                    else
                        System.out.println("Phone not found");

                    break;

                case 7:

                    cart.undo();
                    break;

                case 8:

                    cart.viewCart();
                    break;

                case 9:

                    for (Product item : cart.cart)
                        orders.placeOrder(item);

                    orders.processOrders();
                    break;

                case 10:

                    System.exit(0);
            }
        }
    }
}
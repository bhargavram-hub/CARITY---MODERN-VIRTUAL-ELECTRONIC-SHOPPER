import java.util.*;

public class ProductDatabase {

    public static ArrayList<Product> getProducts() {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("iPhone 15", "Apple", 80000));
        list.add(new Product("Galaxy S23", "Samsung", 75000));
        list.add(new Product("OnePlus 11", "OnePlus", 60000));
        list.add(new Product("Pixel 7", "Google", 55000));
        list.add(new Product("Realme GT Neo 3", "Realme", 35000));
        list.add(new Product("Vivo V29", "Vivo", 32000));
        list.add(new Product("Motorola Edge 40", "Motorola", 30000));
        list.add(new Product("Redmi Note 13", "Redmi", 18000));
        list.add(new Product("Nokia G42", "Nokia", 16000));

        return list;
    }

    public static HashMap<String, Product> buildHashMap(ArrayList<Product> products) {

        HashMap<String, Product> map = new HashMap<>();

        for (Product p : products) {
            map.put(p.name.toLowerCase(), p);
        }

        return map;
    }
}

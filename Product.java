public class Product {

    String name;
    String brand;
    int price;

    public Product(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return brand + " " + name + " - ₹" + price;
    }
}

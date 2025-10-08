// problem b----------------------------------Filtering and Sorting Students Using Streams Part-------------------
import java.util.*;
import java.util.stream.*;

class Product {
    int id;
    String name;
    double price;
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return id + " - " + name + " - " + price;
    }
}

public class ProductStreamOps {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 80000),
            new Product(2, "Phone", 40000),
            new Product(3, "Tablet", 30000),
            new Product(4, "Mouse", 1500)
        );
        System.out.println("Products with price > 20000:");
        products.stream()
                .filter(p -> p.price > 20000)
                .forEach(System.out::println);
        System.out.println("\nProduct names in uppercase:");
        products.stream()
                .map(p -> p.name.toUpperCase())
                .forEach(System.out::println);
        double avgPrice = products.stream()
                .mapToDouble(p -> p.price)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage price: " + avgPrice);
    }
}


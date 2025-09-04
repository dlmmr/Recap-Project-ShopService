package org.example;

import java.util.List;

public class ShopService {
    //Objekte
    ProductRepo productRepo = new ProductRepo();
    Product product = new Product("", "", "", "", "");
    Order order = new Order("", "", "", "", "", "");


    // Methode zur Generierung einer einfachen Order-ID
    private String generateOrderId(int counter) {
        return String.format("ORD-%04d", counter);
    }

    // Methode zum Aufgeben einer Bestellung
    public String makeOrder(List<Order> orders, List<Product> products, Product product) {
        boolean productExists = products.stream()
                .anyMatch(p -> p.productId().equals(product.productId()));

        if (productExists) {
            String orderId = generateOrderId(orders.size() + 1); // z. B. ORD-0001, ORD-0002, ...

            Order newOrder = new Order(
                    orderId,
                    product.productId(),
                    product.productName(),
                    product.productDescription(),
                    product.productPrice(),
                    product.productQuantity()
            );

            orders.add(newOrder);
            return "✅ Bestellung erfolgreich aufgegeben: " + newOrder.toString();
        } else {
            return "❌ Produkt mit ID '" + product.productId() + "' nicht gefunden. Bestellung nicht möglich.";
        }
    }
}



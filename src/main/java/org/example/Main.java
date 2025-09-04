package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Objekte erstellen
        Product p1 = new Product("Kaffeemaschine", "P001", "Moderne Filterkaffeemaschine mit Timerfunktion", "79.99", "15");
        Product p2 = new Product("Bluetooth-Kopfhörer", "P002", "Kabellose Over-Ear-Kopfhörer mit Geräuschunterdrückung", "129.90", "30");
        Product p3 = new Product("Gaming-Tastatur", "P003", "Mechanische RGB-Tastatur mit programmierbaren Tasten", "89.50", "20");
        Product p4 = new Product("Smartphone-Halterung", "P004", "Universelle Halterung für Auto und Schreibtisch", "19.99", "50");
        Product p5 = new Product("USB-C Ladegerät", "P005", "Schnellladegerät mit 65W Leistung und zwei Ports", "34.95", "40");

        ShopService shopService = new ShopService();
        List<Order> orders = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo();
        List<Product> products = new ArrayList<>();
        OrderListRepo orderListRepo = new OrderListRepo();
        Order order = new Order("","","","","","");


        //Methoden aufrufen
        System.out.println(productRepo.addProduct(p1, products));
        System.out.println(productRepo.addProduct(p2, products));
        System.out.println(productRepo.addProduct(p3, products));
        System.out.println(productRepo.addProduct(p4, products));
        System.out.println(productRepo.addProduct(p5, products));
        System.out.println(productRepo.deleteProduct(p1, products));
        System.out.println(productRepo.showProduct(p4, products));
        System.out.println(productRepo.showALlProducts(products));
        System.out.println(shopService.makeOrder(orders, products, p2)); // Erfolgreich
        System.out.println(shopService.makeOrder(orders, products, p1)); // Fehlgeschlagen, da gelöscht
    }
}
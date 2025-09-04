package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products = new ArrayList<>();
    Product product = new Product("", "", "", "","");

    public String addProduct(Product product, List<Product> products) {
        products.add(product);
        return "Product " + product.productName() + " added successfully.";
    }
    public String deleteProduct(Product product, List<Product> products) {
        products.remove(product);
        return "Product " + product.productName() + " deleted successfully.";
    }
    public String showProduct(Product product, List<Product> products) {
        return "Product " + product.productName() + " found successfully." + product.productDescription() + product.productPrice() + product.productQuantity();
    }
    public String showALlProducts( List<Product> products) {
        return products.toString();
    }
}

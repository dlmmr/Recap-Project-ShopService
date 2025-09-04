package org.example;

public record Order(String orderId, String productId, String productName, String productDescription, String productPrice, String productQuantity) {
}

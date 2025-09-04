package org.example;

import java.util.List;

public interface OrderRepo {
    String addOrder(Order order);
    String removeOrder(Order order);
    Order getSingleOrder(String orderId);
    List<Order> getAllOrders();
}

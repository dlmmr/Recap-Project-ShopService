package org.example;

import java.util.*;

public class OrderMapRepo implements OrderRepo {
    private Map<String, Order> orderMap = new HashMap<>();

    @Override
    public String addOrder(Order order) {
        orderMap.put(order.orderId(), order);
        return "Order added: " + order.orderId();
    }

    @Override
    public String removeOrder(Order order) {
        if (orderMap.containsKey(order.orderId())) {
            orderMap.remove(order.orderId());
            return "Order removed: " + order.orderId();
        } else {
            return "Order not found: " + order.orderId();
        }
    }

    @Override
    public Order getSingleOrder(String orderId) {
        return orderMap.get(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }
}

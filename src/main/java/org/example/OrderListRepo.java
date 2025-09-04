package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> orders = new ArrayList<>();

    public String addOrder(Order order, List<Order> orders) {
        orders.add(order);
        return orders.toString();
    }
    public String removeOrder(Order order, List<Order> orders) {
        orders.remove(order);
        return orders.toString();
    }
    public String getSingleOrder(Order order, List<Order> orders) {
        return order.toString();
    }
    public String getAllOrders(Order order, List<Order> orders) {
        return orders.toString();
    }
}

package lab3;

import java.util.HashMap;

public class Orders {
    private HashMap<Integer, Order> orders;

    public Orders() {
        orders = new HashMap<>();
    }

    public void addOrder(int orderNumber, Order order) {
        orders.put(orderNumber, order);
        System.out.println("Order " + orderNumber + " added.");
    }

    public Order getOrder(int orderNumber) {
        return orders.get(orderNumber);
    }

    public void removeOrder(int orderNumber) {
        if (orders.containsKey(orderNumber)) {
            orders.remove(orderNumber);
            System.out.println("Order " + orderNumber + " removed.");
        } else {
            System.out.println("Order " + orderNumber + " not found.");
        }
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            for (Integer orderNumber : orders.keySet()) {
                System.out.println("Order number: " + orderNumber + ", Details: " + orders.get(orderNumber));
            }
        }
    }
}
package com.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Order {
    private List<Item> orderContent;
    private UUID orderId;
    private int oderAccessCode;
    private double totalAmount;

    public Order() {
        this.orderContent = new ArrayList<>();
        this.orderId = UUID.randomUUID();
        this.oderAccessCode = new Random().nextInt(9999 - 1000) + 1000;
        this.totalAmount = 0;
    }

    public void pay(DeliveryPaymentStrategy deliveryPaymentStrategy) {
        deliveryPaymentStrategy.pay(getTotalAmount(), getOrderId(), getOderAccessCode());
    }

    public void addItem(Item item) {
        this.orderContent.add(item);
        this.totalAmount += item.getPrice();
    }

    public void removeItem(Item item) {
        this.orderContent.remove(item);
        this.totalAmount -= item.getPrice();
    }

    public List<Item> getOrderContent() {
        return orderContent;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public int getOderAccessCode() {
        return oderAccessCode;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

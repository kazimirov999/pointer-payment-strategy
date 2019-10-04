package com.strategy;

import java.util.UUID;

public class NormalDeliveryStrategy implements DeliveryPaymentStrategy {

    private static final double DELIVERY_PRICE = 5;

    @Override
    public void pay(double totalAmount, UUID id, int accessCode) {
        double toPay = totalAmount + DELIVERY_PRICE;
        System.out.println("Delivery " + id + " priority -> FAST; \n" +
                "Total Amount to be paid -> " + toPay + " $ \n" +
                "Delivery access code -> " + accessCode + '\n');
    }
}

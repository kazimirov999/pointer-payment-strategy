package com.strategy;

import java.util.UUID;

public interface DeliveryPaymentStrategy {

    void pay(double totalAmount, UUID id, int accessCode);
}

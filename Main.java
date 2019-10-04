package com.strategy;

public class Main {

    public static void main(String[] a) {

        Order order = new Order();

        Item battery = new Item.Builder()
                .withName("Battery")
                .withWeight(2)
                .withId()
                .withPrice(65)
                .build();

        Item cable = new Item.Builder()
                .withName("cable 5 m")
                .withWeight(3)
                .withId()
                .withPrice(50)
                .build();

        order.addItem(battery);
        order.addItem(cable);

        order.pay(new FastDeliveryStrategy());
        order.pay(new NormalDeliveryStrategy());

    }
}

package com.strategy;

import java.util.UUID;

public class Item {
    private double weight;
    private double price;
    private String name;
    private UUID id;

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public static class Builder {
        private Item newItem;

        public Builder() {
            newItem = new Item();
        }

        public Builder withName(String name) {
            newItem.name = name;
            return this;
        }

        public Builder withPrice(double price) {
            newItem.price = price;
            return this;
        }

        public Builder withId() {
            newItem.id = UUID.randomUUID();
            return this;
        }

        public Builder withWeight(double weight) {
            newItem.weight = weight;
            return this;
        }


        public Item build() {
            return newItem;
        }

    }
}

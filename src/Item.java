public class Item {

    private String upcCode;
    private int price;

    public static class Builder {

        Item item;

        public Builder() {
            item = new Item();
        }

        public Builder withUpcCode(String upcCode) {
            item.upcCode = upcCode;
            return this;
        }

        public Builder withPrice(int price) {
            item.price = price;
            return this;
        }

        public Item build() {
            return item;
        }
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}

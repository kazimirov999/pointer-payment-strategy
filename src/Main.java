public class Main {

    public static void main(String[] args) {
        ShoppingCart c = new ShoppingCart();
        Item item1 = new Item.Builder()
                .withUpcCode("1234")
                .withPrice(186)
                .build();
        Item item2 = new Item.Builder()
                .withUpcCode("4687")
                .withPrice(265)
                .build();
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy.Builder()
                .withName("John")
                .withCardNumber("1289214")
                .withCVV("322")
                .withDateOfExpiry("19.02.81")
                .build();
        PaypalStrategy paypalStrategy = new PaypalStrategy.Builder()
                .withEmailId("someemail@gmail.com")
                .withPassword("common123")
                .build();
        c.addItem(item1);
        c.addItem(item2);
        c.pay(creditCardStrategy);
        c.pay(paypalStrategy);
    }
}

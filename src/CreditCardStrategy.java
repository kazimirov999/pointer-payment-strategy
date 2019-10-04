public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public static class Builder {

        private CreditCardStrategy creditCardStrategy;

        public Builder() {
            creditCardStrategy = new CreditCardStrategy();
        }

        public Builder withName(String name) {
            creditCardStrategy.name = name;
            return this;
        }

        public Builder withCardNumber(String cardNumber) {
            creditCardStrategy.cardNumber = cardNumber;
            return this;
        }

        public Builder withCVV(String cvv) {
            creditCardStrategy.cvv = cvv;
            return this;
        }

        public Builder withDateOfExpiry(String dateOfExpiry) {
            creditCardStrategy.dateOfExpiry = dateOfExpiry;
            return this;
        }

        public CreditCardStrategy build() {
            return creditCardStrategy;
        }
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " has been paid using credit card");
    }
}

public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public static class Builder {

        PaypalStrategy paypalStrategy;

        public Builder() {
            paypalStrategy = new PaypalStrategy();
        }

        public Builder withEmailId(String emailId) {
            paypalStrategy.emailId = emailId;
            return this;
        }

        public Builder withPassword(String password) {
            paypalStrategy.password = password;
            return this;
        }

        public PaypalStrategy build() {
            return paypalStrategy;
        }
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " has been paid using paypal");
    }
}

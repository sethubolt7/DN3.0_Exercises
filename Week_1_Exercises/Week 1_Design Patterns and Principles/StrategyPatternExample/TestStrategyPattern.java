public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Use Credit Card payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/25");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.pay(150.75);

        // Use PayPal payment strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "securepassword");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.pay(89.50);
    }
}
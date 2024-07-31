public class test {
    public static void main(String[] args) {
        // Create the context
        PaymentContext paymentContext = new PaymentContext();

        // Set and use Credit Card payment strategy
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "Subhrajit");
        paymentContext.setPaymentStrategy(creditCard);
        paymentContext.executePayment(100.0);

        // Set and use PayPal payment strategy
        PaymentStrategy payPal = new PayPalPayment("subhrajit.nayak@example.com");
        paymentContext.setPaymentStrategy(payPal);
        paymentContext.executePayment(200.0);
    }
}

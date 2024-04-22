public class PaymentFactory {
    public PaymentMethod createPayment(String paymentType) {
        if ("cash".equalsIgnoreCase(paymentType)) {
            return new CashPayment();
        } else if ("credit".equalsIgnoreCase(paymentType)) {
            return new CreditCardPayment();
        } else {
            throw new IllegalArgumentException("Tipo de pago no válido.");
        }
    }
}

package factory;

import factory.CashPayment;

public class PaymentFactory {
    public PaymentMethod createPayment(String paymentType) {
        if ("cash".equalsIgnoreCase(paymentType)) { // evalua si nuestra variable es igual a cash
            return new CashPayment(); // si es igua nos da una istancia de la clase cashPayment
        } else if ("credit".equalsIgnoreCase(paymentType)) { // evalua si nuestra variable es igual a credit
            return new CreditCardPayment(); // si es igua nos da una istancia de la clase factory.CreditCardPayment
        } else { // en caso de que no decidamos que incluiremos mas pagos ps solo nos devolvera que no tenemos
                // mas formas de pago
            throw new IllegalArgumentException("Tipo de pago no válido.");
        }
    }
}

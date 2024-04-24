package factory;

import factory.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {


    @Override
    public void pay() {
        System.out.println("Pago con targeta de credito realizado con exito ");
    }
}

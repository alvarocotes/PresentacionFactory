package factory;

import factory.PaymentFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();

        PaymentMethod cashPayment = factory.createPayment("cash");
        cashPayment.pay(); // Imprime: "Pago en efectivo realizado."

        PaymentMethod creditCardPayment = factory.createPayment("credit");
        creditCardPayment.pay(); // Imprime: "Pago con tarjeta de crédito realizado."



    }

}
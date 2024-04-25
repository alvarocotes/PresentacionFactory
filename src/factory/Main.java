package factory;

import factory.PaymentFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();

        PaymentMethod cashPayment = factory.createPayment("cash"); //usando el metodo createPayment de la
                                                                            //de la fabrica vamos a guardar en la variable la instancia
                                                                            // del metodo de pago
        cashPayment.pay(); // llamamos el metodo pago del metodo de pago

        PaymentMethod creditCardPayment = factory.createPayment("credit");
        creditCardPayment.pay();



    }

}
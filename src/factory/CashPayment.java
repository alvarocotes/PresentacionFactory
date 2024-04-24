package factory;

public class CashPayment implements PaymentMethod {


    @Override
    public void pay() {
        System.out.println("Pago En Efectivo Realizado con exito");
    }
}

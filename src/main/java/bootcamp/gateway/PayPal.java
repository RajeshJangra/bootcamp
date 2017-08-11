package bootcamp.gateway;

public class PayPal implements PaymentMethod {
    @Override
    public boolean pay(int amount) {
        return true;
    }
}

package bootcamp.gateway;

public class CreditCard implements PaymentMethod {
    @Override
    public boolean pay(int amount) {
        return true;
    }
}

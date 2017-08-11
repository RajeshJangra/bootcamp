package bootcamp.gateway;

public class DebitCard implements PaymentMethod {
    @Override
    public boolean pay(int amount) {
        return true;
    }
}

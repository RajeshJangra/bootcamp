package bootcamp.gateway;

public class NetBanking implements PaymentMethod {
    @Override
    public boolean pay(int amount) {
        return true;
    }
}

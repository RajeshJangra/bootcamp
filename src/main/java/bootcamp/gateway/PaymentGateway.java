package bootcamp.gateway;

public class PaymentGateway {
    PaymentMethod paymentMethod;

    public PaymentGateway(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean pay(int amount) {
        return paymentMethod.pay(amount);
    }
}

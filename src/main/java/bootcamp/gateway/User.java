package bootcamp.gateway;

public class User {

    private PaymentMethod paymentMethod;

    private PaymentGateway gateway;

    public User(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        gateway = new PaymentGateway(paymentMethod);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean pay(int amount) {
        return gateway.pay(amount);
    }
}

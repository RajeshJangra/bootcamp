package bootcamp.gateway;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PaymentGatewayTest {

    @Test
    public void shouldPayWithCreditCard(){
        assertThat(new PaymentGateway(new CreditCard()).pay(100), is(true));
    }

    @Test
    public void shouldPayWithNetBanking(){
        assertThat(new PaymentGateway(new NetBanking()).pay(100), is(true));
    }

    @Test
    public void shouldPayWithDebitCard(){
        assertThat(new PaymentGateway(new DebitCard()).pay(100), is(true));
    }

    @Test
    public void shouldPayWithPaypal(){
        assertThat(new PaymentGateway(new PayPal()).pay(100), is(true));
    }
}

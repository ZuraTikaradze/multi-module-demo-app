package ge.zura.payment;

import java.math.BigDecimal;

public class PaymentCalculationService {

    public BigDecimal calculate(BigDecimal amount) {
        return amount.add(new BigDecimal(100));
    }
}

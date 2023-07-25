package ge.zura.payment;

import ge.zura.model.Payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    public List<Payment> payments() {
        List<Payment> paymentList = new ArrayList<>();
        paymentList.add(new Payment(1L, "Internet", new BigDecimal(50)));
        return paymentList;
    }
}

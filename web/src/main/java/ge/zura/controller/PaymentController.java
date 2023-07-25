package ge.zura.controller;

import ge.zura.model.Payment;
import ge.zura.payment.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PaymentController {

    @GetMapping("payments")
    public List<Payment> payments(){
        PaymentService paymentService=new PaymentService();
        return paymentService.payments();
    }
}

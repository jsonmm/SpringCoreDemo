package org.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component
//@Primary
public class UPIservice implements paymentMethod {
    @Override
    public void pay()
    {
        System.out.println("payment done through upi");
    }


}

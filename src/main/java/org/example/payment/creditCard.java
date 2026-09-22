package org.example.payment;

import org.springframework.stereotype.Component;


//@Component

public class creditCard implements paymentMethod{
    @Override
    public void pay()
    {
        System.out.println("payment done through Credit card ending with ..XXX73");
    }
}

package org.example.payment;

import org.springframework.stereotype.Component;

//@Component
public class cod implements paymentMethod{
    @Override
    public void pay()
    {
        System.out.println("payment done through cash on delivery");
    }
}

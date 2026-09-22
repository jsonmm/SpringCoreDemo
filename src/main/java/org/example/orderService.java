package org.example;

import org.example.payment.UPIservice;
import org.example.payment.paymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class orderService {
//    @Autowired
//    @Qualifier("creditCard")
    public paymentMethod pay ;
//    @Autowired
    public orderService(paymentMethod pay)
    {
        this.pay = pay;
    }
//    @Autowired
//    public void setPay(@Qualifier("cod") paymentMethod pay) {
//        this.pay = pay;
//    }

    public void placeOrder()
    {
        pay.pay();
        System.out.println("order placed");
    }


}

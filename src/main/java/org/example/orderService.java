package org.example;

import org.example.payment.UPIservice;
import org.example.payment.creditCard;
import org.example.payment.paymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class  orderService {

    private paymentMethod pay ;

    public orderService(paymentMethod pay)
    {
        this.pay = pay;

    }
  @Autowired
    public void setPay(@Qualifier("creditCard ") paymentMethod pay) {
        this.pay = pay;
    }

    public void placeOrder()
    {
        pay.pay();
        System.out.println("order placed");
    }


}

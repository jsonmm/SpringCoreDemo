package org.example;

import org.example.payment.UPIservice;
import org.example.payment.creditCard;
import org.example.payment.paymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component
public class orderService {
    private final User createUser;
    private final creditCard creditCard;
    //    @Autowired
//    @Qualifier("creditCard")
    public paymentMethod pay ;
//    @Autowired
    public orderService(@Qualifier("creditCard") paymentMethod pay, User createUser, creditCard creditCard)
    {
        this.pay = pay;
        this.createUser = createUser;
        this.creditCard = creditCard;
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

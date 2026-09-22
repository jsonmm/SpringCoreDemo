package org.example;

import org.example.payment.UPIservice;
import org.example.payment.creditCard;
import org.example.payment.paymentMethod;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration


public class  AppConfig {
    @Bean
    public User createUserBean()
    {
        return new User("Manish", 27); // jase hi spring app config ko read karega wo inka result ampne ioc container
        // store kar lega
    }
    @Bean
    @Qualifier
    public paymentMethod CreateCardPaymentBean(){
        return new creditCard();
    }

    @Qualifier
    @Bean
    public paymentMethod createUpiBean()
    {
        return new UPIservice();
    }
    @Bean
    public orderService createNewOrderBean(@Qualifier("createUpiBean") paymentMethod paymentMethod){
       return new orderService(paymentMethod);
    }
}

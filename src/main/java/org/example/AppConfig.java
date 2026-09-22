package org.example;

import org.example.payment.creditCard;
import org.example.payment.paymentMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.example")

public class  AppConfig {
    @Bean
    public User createUser()
    {
        return new User("Manish", 27); // jase hi spring app config ko read karega wo inka result ampne ioc container
        // store kar lega
    }
    @Bean
    public paymentMethod CreateCardPayment(){
        return new creditCard();
    }
    @Bean
    public paymentMethod createCreditPayment()
    {
        return new creditCard();
    }

    @Bean
    public orderService createNewOrder(paymentMethod paymentMethod){
        return new orderService();
    }
}

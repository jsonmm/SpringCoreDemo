package org.example;

import org.example.payment.UPIservice;
import org.example.payment.cod;
import org.example.payment.creditCard;
import org.example.payment.paymentMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        orderService order = context.getBean(orderService.class);
        order.placeOrder();
        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}
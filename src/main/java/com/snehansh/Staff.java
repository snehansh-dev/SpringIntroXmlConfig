package com.snehansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Staff extends User implements UserInterface {
    @Override
    public void getUser() {
        //super.toString();
        System.out.println(super.toString());
    }
}

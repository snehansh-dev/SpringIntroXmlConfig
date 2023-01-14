package com.snehansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User staff = context.getBean(Staff.class);
        staff.setUserId(101);
        staff.setUserFirstName("Shekhar");
        staff.setUserLastName("Nandanwar");
        staff.setUserAddress("Dhayri");
        staff.setUserCity("Pune");
        staff.setUserDateOfBirth(LocalDate.of(1989,01,15));
        staff.setUserContactNumber(9922113344L);
        staff.setUserEmailId("Shekhar15jan@gmail.com");
        ((Staff) staff).getUser();
    }
}
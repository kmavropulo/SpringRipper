package com.epam.university.springripper;

import com.epam.university.springripper.quoters.TerminatorQuoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        classPathXmlApplicationContext.getBean(TerminatorQuoter.class).sayQuote();
    }
}

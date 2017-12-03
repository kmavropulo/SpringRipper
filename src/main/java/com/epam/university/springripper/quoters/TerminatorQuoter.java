package com.epam.university.springripper.quoters;

import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Setter
public class TerminatorQuoter implements Quoter {
    private static final Logger logger = LoggerFactory.getLogger(TerminatorQuoter.class);
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;


    @Override
    public void sayQuote() {
        System.out.println("test"+ repeat);

        for (int i = 0; i < repeat; i++) {
            logger.debug("message" + message);
        }
    }
}

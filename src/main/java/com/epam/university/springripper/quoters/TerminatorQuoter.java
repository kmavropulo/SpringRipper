package com.epam.university.springripper.quoters;

import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

@Profiling
@Setter
public class TerminatorQuoter implements Quoter {
    private static final Logger logger = LoggerFactory.getLogger(TerminatorQuoter.class);
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    //firstly fields are initialized, so the value is null
    public TerminatorQuoter() {
        logger.debug("1: TerminatorQuoter's constructor started...");
        logger.debug("1: repeat=" + repeat);
    }

    //constructor beforeInitialization/construct/init afterInitialization
    @PostConstruct
    public void init() {
        logger.debug("3: TerminatorQuoter's init() started...");
        logger.debug("3: repeat=" + repeat);
    }

    //@PostConstruct can be added to any method and in will be called after init just like init(..)
    @Override
    @PostProxy
    public void sayQuote() {
        logger.debug("6: TerminatorQuoter's sayQuote() started...");
        for (int i = 0; i < repeat; i++) {
            logger.debug("6: message=" + message);
        }
    }
}
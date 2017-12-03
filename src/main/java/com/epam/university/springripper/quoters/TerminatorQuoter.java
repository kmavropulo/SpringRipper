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
        logger.debug("TerminatorQuoter's constructor started...");
        logger.debug("repeat = " + repeat);
    }

    @PostConstruct
    public void init() {
        logger.debug("TerminatorQuoter's init() started...");
        logger.debug("repeat" + repeat);
    }

    @Override
    public void sayQuote() {
        logger.debug("TerminatorQuoter's sayQuote() started...");
        for (int i = 0; i < repeat; i++) {
            logger.debug("message" + message);
        }
    }
}
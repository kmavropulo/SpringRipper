package com.epam.university.springripper.quoters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class T1000 extends TerminatorQuoter implements Quoter{
    private static final Logger logger = LoggerFactory.getLogger(TerminatorQuoter.class);

    @Override
    public void sayQuote() {
        logger.debug("I'm liquid.");
    }
}
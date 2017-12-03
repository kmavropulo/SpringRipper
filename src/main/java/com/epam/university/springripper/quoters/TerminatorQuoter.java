package com.epam.university.springripper.quoters;

import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Setter
public class TerminatorQuoter implements Quoter {
    private static final Logger logger = LoggerFactory.getLogger(TerminatorQuoter.class);
    private String message;

    @Override
    public void sayQuote() {
        logger.debug(message);
    }
}

package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SpringLoggerExample {
private static final Logger logger = LoggerFactory.getLogger(SpringLoggerExample.class);
    public void logMessages() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }

}

package com.edgydebug.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(SLF4JExample.class);

    public static void main(String[] args) {
        int age = 30;
        LOGGER.info("At the age of {} dan got his first job", age);
        LOGGER.error("{}, {}! An exception occurred!",
                "Hello",
                "World",
                new Exception("SLF4JExample exception"));
    }

}

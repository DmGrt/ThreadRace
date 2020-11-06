package com.thread.race;

import org.apache.log4j.Logger;

public class MyThreadExtends extends Thread {
    private static final Logger logger = Logger.getLogger(MyThreadExtends.class);
    private Counter counter;

    public MyThreadExtends(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < 100) {
            counter.increment();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getValue());
        }
    }
}

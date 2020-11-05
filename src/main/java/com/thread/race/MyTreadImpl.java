package com.thread.race;

import org.apache.log4j.Logger;

public class MyTreadImpl implements Runnable {
    private static final Logger logger = Logger.getLogger(MyTreadImpl.class);
    private Counter counter;

    public MyTreadImpl(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getValue() < 100) {
            counter.increment();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getValue());
        }
    }
}

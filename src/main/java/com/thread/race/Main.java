package com.thread.race;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadExtends threadExtends = new MyThreadExtends(counter);
        MyTreadImpl treadImpl = new MyTreadImpl(counter);
        Thread thread = new Thread(treadImpl);
        threadExtends.start();
        thread.start();
    }
}

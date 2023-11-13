/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;


public class MessagePrinter implements Runnable {
    private final String threadNamePrefix = "message = printer";
    private static int id = 0;

    private final String message;
    private int count = 10;
    private  long interval = 1000;


    public MessagePrinter(String message) {
        this.message = message;

    }

    public MessagePrinter(String message, int count, long interval) {
        this(message);
        this.count = count;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + message) ;

        }
        try {
            Thread.sleep(interval);

        }
        catch (InterruptedException ignored) {

        }

    }
}
/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

    public static void main(String[] args) {
       // 30 sec total
        MessagePrinter printer1 = new MessagePrinter("roses are red ", 10, 3000);
        printer1.start();

        // 20 sec total
        MessagePrinter printer2 = new MessagePrinter("violets are black", 100, 200);
        printer2.start();

        // 10 times(default),1 second each = 10 sec
        MessagePrinter printer3 = new MessagePrinter("im not well");
        printer3.start();

        //32 secs
        MessagePrinter printer4 = new MessagePrinter("actually, sugar is toxic", 16, 2000);
        printer4.start();
    }
}
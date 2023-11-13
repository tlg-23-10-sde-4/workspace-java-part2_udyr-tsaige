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
        Thread thd1 = new Thread(printer1);
        thd1.setName("message -printer1");
        thd1.start();
        //printer1.start();

        // 20 sec total
        MessagePrinter printer2 = new MessagePrinter("violets are blue", 100, 200);
        Thread thd2 = new Thread(printer2);
        thd1.setName("message -printer2");
        thd1.start();
       // printer2.start();

        // 10 times(default),1 second each = 10 sec
       // MessagePrinter printer3 = new MessagePrinter("ill hand you a knife ");
        Thread thd3 = new Thread((new MessagePrinter("ill hand you a knife"), "message-printer-3");
       // printer3.start();

        //32 secs
        MessagePrinter printer4 = new MessagePrinter("and bid you a due,", 16, 2000);
        Thread thd4 = new Thread(printer4, "message-printer-4");
        thd4.start();
        //printer4.start();
    }
}
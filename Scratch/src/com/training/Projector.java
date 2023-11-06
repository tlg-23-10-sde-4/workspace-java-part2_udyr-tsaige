package com.training;

public class Projector {

    public Projector() {
        System.out.println("Projector ctor called");
    }

    // this executes when the Classloader loads Projector. class into memory
    static {
        System.out.println("Projector.com loaded into memory");

    }

}

package com.training;

public class Client {
    public static void main(String[] args) {
        // classloader loads Instructor, witch Initialized tha static(shared ) project
      // Instructor inst1 = new Instructor("Udyr", 100);

      // Instructor inst2 = new Instructor("Ryan", 10);

        Instructor.touch();
        Instructor.touch();


    }

}

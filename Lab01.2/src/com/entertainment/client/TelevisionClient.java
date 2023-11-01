package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {

    public static void main(String[] args) {
        /*
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);

        System.out.println(tv1); // toString() automatically called
        System.out.println(tv2);

        tv2.changeChannel(9);
        System.out.println(tv2);
        System.out.println();

         */

        // show behavior of == versus equal()
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony",50);

        System.out.println("tvA == tvB:"  +(tvA == tvB));  // obviously false
        System.out.println("tvA.equals(tvB0:" + tvA.equals(tvB)); // this is true now
        System.out.println();


        Set<Television> tvs = new HashSet<>();
        tvs. add (tvA);
        tvs. add (tvB); // should be rejected as a duplicate
        System.out.println("The size of the set is: " + tvs.size());



    }
}

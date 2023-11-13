package org.udyr.stats;

//import org.stats.RatingAnalyzer; confuses me not sure why this brakes it
import org.stats.AnalyzerConfigurationException;
import org.stats.RatingAnalyzer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

 /*
 *need to  make a list of what is all needed and check off as I go (REMINDER)
 *not entirely sure what all was needed to me implemented,
 *so I may have added more than I needed as below I added a try - catch
 */

/**
 * JR: Below expectations and severely flawed in several areas.
 *  - Implementation class name does not match source file name, is not a public class,
 *    and does not "implements" the RatingAnalyzer interface.
 *  - Constructor does not throw exception upon null or empty input ratings -
 *    instead, it's thrown from the spec methods mean(), median(), mode().
 *  - Implementation class incorrectly contains the newInstance() method,
 *    which is provided in the spec's interface itself.
 *  - rating-analyzer.properties file not correct, instructor tests impossible to run.
 *  - After significant resources spent by instructor (60 min.) to correct these structural
 *    problems, student's own tests are failing, and testing not thorough enough.
 *
 * Source file is named RatingAnalyzerImpl.java, but contains a class a definition
 * named RatingAnalyzer.  You can see that this looks different in the Project Panel
 * in IntelliJ.  Class name must ALWAYS match source file name.
 * Per spec, implementation class must be public.
 * NOTE: Instructor corrected these errors in order to run tests.
 *
 * Also check for comments below and in test class.
 */

/*
 * JR: incorrect class name, see comments above.
 * Instructor corrected it below, made it a public class (per spec),
 * and signed the interface contract via "implements RatingAnalyzer."
 */
// class RatingAnalyzer {
public class RatingAnalyzerImpl implements RatingAnalyzer {

    // JR: this would have been correct, but was changed to the incorrect name above (RatingAnalyzer)
    // public class RatingAnalyzerImpl implements RatingAnalyzer // need to figure it out


    // FIELD
    private final int[] ratings;

    /*
     * JR: this is your ctor, and per spec,
     * it must throw IllegalArgumentException upon null or empty input ratings.
     */

    // JR: had to change this due to change in class name
    // public RatingAnalyzer(int[] ratings) {
    public RatingAnalyzerImpl(int[] ratings) {
        this.ratings = ratings;
            /*
            public RatingAnalyzerImpl(int[] ratings) throw AnalyzerConfigurationException {
                if (ratings.length == 0) {
                    throw new AnalyzerConfigurationException("rating must contain at least int");
                }
                setRatings(ratings);
                ratinglistSorter();
                }
        }                   // TODO : need to get this working

             */
    }


    //  CONSTRUCTOR

    /*
     * JR: this is not a constructor, and you should not have this newInstance() method.
     * From the instructions PDF:
     *  This static factory method is already implemented in the interface itself,
     *  you DO NOT need to code it.
     */

    // JR: commented out by instructor in order to run tests
    /*
    public static RatingAnalyzer newInstance(int[] ratings) {
        try {
            if (ratings == null || ratings.length == 0) {
                throw new IllegalArgumentException("Invalid array");
            }
            return new RatingAnalyzer(ratings);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
    */

    public double mean() throws IllegalArgumentException {
        if (ratings == null || ratings.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        double sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }

        return sum / ratings.length;
    }

    public double median() throws IllegalArgumentException {
        if (ratings == null || ratings.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        Arrays.sort(ratings);
        int middle = ratings.length / 2;

        if (ratings.length % 2 == 0) {
            return (double) (ratings[middle - 1] + ratings[middle]) / 2;
        } else {
            return ratings[middle];
        }
    }
        /*
         * Implemented try-catch not knowing if it was needed or not, so I attempted to show it below.
         * Not entirely sure if it was done correctly, but it didn't break.
         */

    public int[] mode() throws IllegalArgumentException {
        try {
            if (ratings == null || ratings.length == 0) {
                throw new IllegalArgumentException("Empty ratings array");
            }

            Map<Integer, Integer> countMap = new HashMap<>();
            int maxCount = 0;

            for (int rating : ratings) {
                int count = countMap.getOrDefault(rating, 0) + 1;
                countMap.put(rating, count);
                maxCount = Math.max(maxCount, count);
            }

            List<Integer> modesList = new ArrayList<>();
            for (int rating : countMap.keySet()) {
                if (countMap.get(rating) == maxCount) {
                    modesList.add(rating);
                }
            }

            int[] modes = new int[modesList.size()];
            for (int i = 0; i < modes.length; i++) {
                modes[i] = modesList.get(i);
            }

            Arrays.sort(modes);
            return modes;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
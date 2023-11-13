package org.udyr.stats;

//import org.stats.RatingAnalyzer; when imported after this makes you want to make the methods again.
import org.stats.AnalyzerConfigurationException;
//import org.stats.RatingAnalyzer;
import org.junit.Test;
import org.stats.RatingAnalyzer;
import static org.junit.Assert.*;

public class RatingAnalyzerTest {
    // JR: fields should be private
    int[] ratings = {3, 5, 2, 3, 4, 1, 3, 4, 3};

    // JR: fields should be private
    RatingAnalyzer analyzer = RatingAnalyzer.newInstance(ratings);

    /*
     * need to get this working not sure why it will not pass !!!
     * not sure why mean is not passing need to work on this issue.
     */
    @Test
    public void mean_shouldReturnAverage_whenRatingsValid() {
        double expectedMean = 3.0; // Calculate the expected mean based on the ratings array
        assertEquals(expectedMean, analyzer.mean(), 0.001);
    }
    /*
     * need to throw IllegalArgumentException and show it as broken
     * not working need to fix issue.
     */

    /*
     * JR: to be 100% sure of correct behavior here, you need to check two things:
     *  1. AnalyzerConfigurationException is thrown from RatingAnalyzer.newInstance().
     *  2. The nested exception inside is an instance of IllegalArgumentException.
     * See first two test methods (prefixed with "constructor_") in my test class,
     * com.jrostosk.stats.RatingAnalyzerImplTest.
     */
      @Test (expected = IllegalArgumentException.class)
    public void mean_shouldThrowIllegalArgumentException() {
        int[] a ={}; // expecting this to fail and be wrong and throw IllegalArgumentException (not throwing)

        // JR: changed this in order to run tests
        // analyzer = new RatingAnalyzer(a);
        analyzer = RatingAnalyzer.newInstance(a);
    }

    @Test
    public void median_shouldReturnMiddleValue_whenRatingsValid() {
        double expectedMedian = 3; // Calculate the expected median based on the ratings array
        assertEquals(expectedMedian, analyzer.median(), 0.001);
    }
    //TODO: need to get this working also
     @Test
    public void median_shouldReturnDouble_whenRatingsContainsNegativeInts() {
         RatingAnalyzer ratingAnalyzer = RatingAnalyzer.newInstance(null);
          assertEquals(0, ratingAnalyzer.median(), .001);

    }

    @Test
    public void mode_shouldReturnMostFrequentValue_whenRatingsValid() {
        int[] expectedMode = {3}; // Calculate the expected mode based on the ratings array
        assertArrayEquals(expectedMode, analyzer.mode());
    }
}
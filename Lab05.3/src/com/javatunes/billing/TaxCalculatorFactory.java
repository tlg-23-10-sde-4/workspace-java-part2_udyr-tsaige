package com.javatunes.billing;

public class TaxCalculatorFactory {

    // prevent instantiation form outsaide, ths is a all-static class
    private TaxCalculatorFactory() {}

    /*
     * Consider implementing a cache of TaxCalculator objects
     * if I have not previously created the object
     * ill create it here (with new), add it to my cache, and then return it
     *
     * however, if my cache already contains it, then just fetch it
     * from the cache and return it
     *
     * Hint: you could use a simple Map<Location, TaxCalculator> from the cache
     * It wold be a 3-row Map, each row has a Location | TaxCalculator
     */

    public static TaxCalculator getTaxCalculator(Location location) {
        TaxCalculator calc = null;

        switch (location) {
            case ONLINE:
                calc = new OnlineTax();
                break;
            case  USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();

        }

        return calc;
    }
}

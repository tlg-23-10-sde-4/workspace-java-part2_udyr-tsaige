package com.javatunes.billing;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculatorFactory {




    private  static final Map<Location,TaxCalculator> calcMap = Map.of(
            Location.ONLINE, new OnlineTax(),
            Location.USA, new USATax(),
            Location.EUROPE,new EuropeTax()
    );

    // prevent instantiation form outside, ths is an all-static class
    private TaxCalculatorFactory() {
    }

    /*
     * // TODO: Consider implementing a "cache" of TaxCalculator object.
     *
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
        /*
        if (!calcMap.containsKey(location)) {
        switch (location) {
            case ONLINE:
                calcMap.put(location, new OnlineTax());
                break;
            case USA:
                calcMap.put(location, new USATax());
                break;
            case EUROPE:
                calcMap.put(location, new EuropeTax());
        }

        }

         */

        return calcMap.get(location);
    }
}

package com.entertainment;

import com.entertainment.Television;
import com.entertainment.TelevisionChannelComparator; {

public class TelevisionChannelComparatorTest {
    Television tv1 = new Television("Sony", 10);
    Television tv2 = new Television("Samsung", 20);

    TelevisionChannelComparator comparator = new TelevisionChannelComparator();

    int result = comparator.compare(tv1, tv2);

    assertEqual(tv1.getCurrentChannel(),tv2.

    getCurrentChannel());
}

}


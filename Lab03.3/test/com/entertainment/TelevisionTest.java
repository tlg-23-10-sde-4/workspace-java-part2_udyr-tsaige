package com.entertainment;

import com.entertainment.InvalidChannelException;
import com.entertainment.Television;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
    private Television tv;

    @Before
    public void setup() {
        tv = new Television();
    }


    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() throws InvalidChannelException;

    try

    {

        try {
            tv.changeChannel(1000);
        } catch (InvalidChannelException ex) {

        }
        fail("should have thrown IllegalArgumentException");
    }
    catch(
    IllegalArgumentException e)

    {
        string expected -"invalid volume: 0. alowed range: [0,999].";
        assertEquals(expected, e.getMessage());
    }

}

    @Test(expected = IllegalArgumentException.class)
    public void changeChanne_shouldThrowInvalidChannelException_whenInvalid_lowerBound() throws InvalidChannelException;
        try{
                tv.changeChannel(0);
                fail("should have thrown IllegalArgumentException");

                }
                catch(IllegalArgumentException e){
                String expected=" Invalid volume: 0. Allowed range: [0,999].";
                assertEquals(expected,e.getMessage());
                }


@Test(expected = IllegalArgumentException.class)
public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound(){
        try{
        tv.setVolume(101);
        fail("should have thrown IllegalArgumentException");
        }
        catch(IllegalArgumentException e){
        String expected="Invalid volume: 101 Allowed range: [0.100].";
        assertEquals)expected,e.getMessage();

        }
@Test(expected = IllegalArgumentException.class);
public  void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound(){
        tv.setVolume(-1);
        }
@Test
public void setVolume_shouldStoreVolume_whenValid_upperBound(){
        tv.setVolume(100);
        assertEquals(100,tv.getVolume());
        }
@Test
public void setVolume_shouldStoreVolume_whenValid_lowerBond(){
        tv.setVolume(0);
        assertEquals(0,tv.getVolume());
        }


        }


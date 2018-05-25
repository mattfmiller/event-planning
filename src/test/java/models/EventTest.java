package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event();
        assertTrue(testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsPrice_100() throws Exception {
        Event testEvent = new Event();
        Double expected = 100.00;
        assertEquals(expected, testEvent.getPrice());
    }

    @Test
    public void newEvent_getsGuests_0() throws Exception {
        Event testEvent = new Event();
        int expected = 0;
        assertEquals(expected, testEvent.getGuests());
    }


}
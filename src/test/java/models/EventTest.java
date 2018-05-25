package models;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void newEvent_getsFood_none() throws Exception {
        Event testEvent = new Event();
        String expected = "none";
        assertEquals(expected, testEvent.getFood());
    }

    @Test
    public void newEvent_getsDrink_none() throws Exception {
        Event testEvent = new Event();
        String expected = "none";
        assertEquals(expected, testEvent.getDrink());
    }

    @Test
    public void newEvent_getsEntertainment_none() throws Exception {
        Event testEvent = new Event();
        String expected = "none";
        assertEquals(expected, testEvent.getEntertainment());
    }

    @Test
    public void newEvent_getsCouponCode_none() throws Exception {
        Event testEvent = new Event();
        String expected = "none";
        assertEquals(expected, testEvent.getCouponCode());
    }

    @Test
    public void newEvent_getsFoodPrices_map() throws Exception {
        Event testEvent = new Event();
        Map<String, Double> expected = new HashMap();
        expected.put("none", 0.00);
        expected.put("snacks", 5.00);
        expected.put("dinner", 15.00);
        expected.put("dinner with dessert", 20.00);
        assertEquals(expected, testEvent.getFoodPrices());
    }

    @Test
    public void newEvent_getsDrinkPrices_map() throws Exception {
        Event testEvent = new Event();
        Map<String, Double> expected = new HashMap();
        expected.put("none", 0.00);
        expected.put("punch", 5.00);
        expected.put("full bar", 20.00);
        assertEquals(expected, testEvent.getDrinkPrices());
    }

    @Test
    public void newEvent_getsEntertainmentPrices_map() throws Exception {
        Event testEvent = new Event();
        Map<String, Double> expected = new HashMap();
        expected.put("none", 0.00);
        expected.put("DJ", 200.00);
        expected.put("band", 800.00);
        assertEquals(expected, testEvent.getEntertainmentPrices());
    }

    @Test
    public void setGuests_setsGuests_25() {
        Event testEvent = new Event();
        testEvent.setGuests(25);
        int expected = 25;
        assertEquals(expected, testEvent.getGuests());
    }

    @Test
    public void setFood_setsFood_snacks() {
        Event testEvent = new Event();
        testEvent.setFood("snacks");
        String expected = "snacks";
        assertEquals(expected, testEvent.getFood());
    }

    @Test
    public void setDrink_setsDrink_fullBar() {
        Event testEvent = new Event();
        testEvent.setDrink("full bar");
        String expected = "full bar";
        assertEquals(expected, testEvent.getDrink());
    }

    @Test
    public void setEntertainment_setsEntertainment_dj() {
        Event testEvent = new Event();
        testEvent.setEntertainment("DJ");
        String expected = "DJ";
        assertEquals(expected, testEvent.getEntertainment());
    }

    @Test
    public void setCouponCode_setsCouponCode_1() {
        Event testEvent = new Event();
        testEvent.setCouponCode("1");
        String expected = "1";
        assertEquals(expected, testEvent.getCouponCode());
    }

    @Test
    public void setPrice_setsPrice_1175() {
        Event testEvent = new Event();
        testEvent.setGuests(25);
        testEvent.setFood("snacks");
        testEvent.setDrink("full bar");
        testEvent.setEntertainment("DJ");
        testEvent.setPrice();
        Double expected = 1175.00;
        assertEquals(expected, testEvent.getPrice());
    }

}
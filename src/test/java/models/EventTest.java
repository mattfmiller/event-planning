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
        expected.put("dj", 200.00);
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
        testEvent.setEntertainment("dj");
        String expected = "dj";
        assertEquals(expected, testEvent.getEntertainment());
    }

    @Test
    public void setCouponCode_setsCouponCode1_1() {
        Event testEvent = new Event();
        testEvent.setCouponCode("1");
        String expected = "1";
        assertEquals(expected, testEvent.getCouponCode());
    }

    @Test
    public void setCouponCode_setsCouponCode_0() {
        Event testEvent = new Event();
        testEvent.setCouponCode("3");
        String expected = "0";
        assertEquals(expected, testEvent.getCouponCode());
    }

    @Test
    public void setCouponCode_setsCouponCode2_2() {
        Event testEvent = new Event();
        testEvent.setGuests(150);
        testEvent.setFood("dinner");
        testEvent.setDrink("full bar");
        testEvent.setCouponCode("2");
        String expected = "2";
        assertEquals(expected, testEvent.getCouponCode());
    }

    @Test
    public void setCouponCode_setsCouponCode2_0() {
        Event testEvent = new Event();
        testEvent.setGuests(149);
        testEvent.setFood("dinner");
        testEvent.setCouponCode("2");
        String expected = "0";
        assertEquals(expected, testEvent.getCouponCode());
    }

    @Test
    public void setPrice_setsPrice_1175() {
        Event testEvent = new Event();
        testEvent.setGuests(25);
        testEvent.setFood("snacks");
        testEvent.setDrink("full bar");
        testEvent.setEntertainment("dj");
        testEvent.setPrice();
        Double expected = 1175.00;
        assertEquals(expected, testEvent.getPrice());
    }

    @Test
    public void applyCoupon_appliesCoupon1Discount_925() {
        Event testEvent = new Event();
        testEvent.setGuests(25);
        testEvent.setFood("snacks");
        testEvent.setDrink("full bar");
        testEvent.setCouponCode("1");
        testEvent.applyCoupon();
        testEvent.setPrice();
        Double expected = 925.00;
        assertEquals(expected, testEvent.getPrice());
    }

    @Test
    public void applyCoupon_appliesCoupon2Entertainment_DJ() {
        Event testEvent = new Event();
        testEvent.setGuests(150);
        testEvent.setFood("dinner");
        testEvent.setDrink("full bar");
        testEvent.setCouponCode("2");
        testEvent.applyCoupon();
        String expected = "dj";
        assertEquals(expected, testEvent.getEntertainment());
    }

    @Test
    public void applyCoupon_appliesCoupon2Discount_6850() {
        Event testEvent = new Event();
        testEvent.setGuests(150);
        testEvent.setFood("dinner");
        testEvent.setDrink("full bar");
        testEvent.setCouponCode("2");
        testEvent.applyCoupon();
        testEvent.setPrice();
        Double expected = 6850.00;
        assertEquals(expected, testEvent.getPrice());
    }

    @Test
    public void checkGuest_checksForValidGuestInput_True() {
        Event testEvent = new Event();
        assertTrue(testEvent.checkGuest("25"));
    }

    @Test
    public void checkFood_checksForValidFoodInput_True() {
        Event testEvent = new Event();
        assertTrue(testEvent.checkFood("dinner"));
    }

    @Test
    public void checkDrink_checksForValidDrinkInput_True() {
        Event testEvent = new Event();
        assertTrue(testEvent.checkDrink("punch"));
    }
}
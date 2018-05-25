package models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Event {
    private double price;
    private int guests;
    private String food;
    private String drink;
    private String entertainment;
    private String couponCode;
    private Map<String, Double> foodPrices;
    private Map<String, Double> drinkPrices;
    private Map<String, Double> entertainmentPrices;

    public Event() {
        this.price = 100.00;
        this.guests = 0;
        this.food = "none";
        this.drink = "none";
        this.entertainment = "none";
        this.couponCode = "none";
        this.foodPrices = new HashMap();
        foodPrices.put("none", 0.00);
        foodPrices.put("snacks", 5.00);
        foodPrices.put("dinner", 15.00);
        foodPrices.put("dinner with dessert", 20.00);
        this.drinkPrices = new HashMap();
        drinkPrices.put("none", 0.00);
        drinkPrices.put("punch", 5.00);
        drinkPrices.put("full bar", 20.00);
        this.entertainmentPrices = new HashMap();
        entertainmentPrices.put("none", 0.00);
        entertainmentPrices.put("DJ", 200.00);
        entertainmentPrices.put("band", 800.00);
    }

    public Double getPrice() {
        return price;
    }

    public int getGuests() {
        return guests;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public Map<String, Double> getFoodPrices() {
        return foodPrices;
    }

    public Map<String, Double> getDrinkPrices() {
        return drinkPrices;
    }

    public Map<String, Double> getEntertainmentPrices() {
        return entertainmentPrices;
    }

    public void setGuests(int guestCount) {
        guests = guestCount;
    }

    public void setFood(String foodSelection) {
        food = foodSelection;
    }

    public void setDrink(String drinkSelection) {
        drink = drinkSelection;
    }

    public void setEntertainment(String entertainmentSelection) {
        entertainment = entertainmentSelection;
    }

    public void setCouponCode(String couponCodeSelection) {
        if (couponCodeSelection.equals("1")) {
            couponCode = couponCodeSelection;
        } else if (couponCodeSelection.equals("2")) {
            if(guests >= 150 && (food.equals("dinner") || food.equals("dinner with dessert")) && !drink.equals("none")) {
                couponCode = "2";
            } else {
                couponCode = "0";
            }
        } else {
            couponCode = "0";
        }
    }

    public void applyCoupon(){
        if (couponCode.equals("1")){
            price -= 50;
        } else if (couponCode.equals("2")){
            entertainment = "DJ";
//            entertainmentPrices.put("DJ", 0.00);
        } else {

        }
    }

    public void setPrice() {
        price += ((guests * 10) + (guests * foodPrices.get(food)) + (guests * drinkPrices.get(drink)) + entertainmentPrices.get(entertainment));
    }



}

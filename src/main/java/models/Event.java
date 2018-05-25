package models;

public class Event {
    private double price;
    private int guests;
    private String food;
    private String drink;
    private String entertainment;

    public Event() {
        this.price = 100.00;
        this.guests = 0;
        this.food = "none";
        this.drink = "none";
        this.entertainment = "none";
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

    public void setPrice(Double additionalCosts) {
        price += additionalCosts;
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

}

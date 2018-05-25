package models;

public class Event {
    private double price;
    private int guests;
    private String food;
    private String beverage;
    private String entertainment;

    public Event() {
        this.price = 0.00;
        this.guests = 0;
        this.food = "none";
        this.beverage = "none";
        this.entertainment = "none";
    }

}

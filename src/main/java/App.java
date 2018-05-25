import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello. I am here to generate a quote for your next event. Let's begin by gathering some information about your party.");
        Event event = new Event();
        Boolean programRunning = true;
        while (programRunning) {
            try {
                System.out.println("How many guests will be attending the party?");
                Boolean guestInvalid = true;
                while (guestInvalid) {
                    String userGuests = bufferedReader.readLine();
                    if (event.checkGuest(userGuests)){
                        event.setGuests(Integer.parseInt(userGuests));
                        guestInvalid = false;
                    } else {
                        System.out.println("That is not a valid number of guests. Please re-enter the number of guests.");
                    }
                }

                System.out.println("What kind of food would you like to have served at your party? snacks, dinner, dinner with dessert, or none");
                Boolean foodInvalid = true;
                while (foodInvalid) {
                    String userFood = bufferedReader.readLine();
                    if (event.checkFood(userFood)){
                        event.setFood(userFood.toLowerCase());
                        foodInvalid = false;
                    } else {
                        System.out.println("That is not a valid food option. Please enter either snacks, dinner, dinner with dessert, or none");
                    }
                }

                System.out.println("What kind of beverages would you like to have served at your party? punch, full bar, or none");
                Boolean drinkInvalid = true;
                while (drinkInvalid) {
                    String userDrink = bufferedReader.readLine();
                    if (event.checkDrink(userDrink)){
                        event.setDrink(userDrink.toLowerCase());
                        drinkInvalid = false;
                    } else {
                        System.out.println("That is not a valid beverage option. Please enter either punch, full bar, or none");
                    }
                }

                System.out.println("What kind of entertainment would you like to have at your party? DJ, band, or none");
                Boolean entertainmentInvalid = true;
                while (entertainmentInvalid) {
                    String userEntertainment = bufferedReader.readLine();
                    if (event.checkEntertainment(userEntertainment)){
                        event.setEntertainment(userEntertainment.toLowerCase());
                        entertainmentInvalid = false;
                    } else {
                        System.out.println("That is not a valid entertainment option. Please enter either DJ, band, or none");
                    }
                }

                System.out.println("Do you have a coupon code you would like to apply to this event? y/n");
                String userHasCoupon = bufferedReader.readLine();
                if (userHasCoupon.equals("y")){
                    System.out.println("Go ahead and enter your coupon code now.");
                    Boolean couponInvalid = true;
                    while (couponInvalid) {
                        String userCoupon = bufferedReader.readLine();
                        if (event.checkCoupon(userCoupon)){
                            event.setCouponCode(userCoupon);
                            couponInvalid = false;
                        } else {
                            System.out.println("That is not a valid coupon entry.");
                        }
                    }

//                    String userCoupon = bufferedReader.readLine();
//                    event.setCouponCode(userCoupon);
                    event.applyCoupon();
                } else {

                }
                event.setPrice();
                System.out.println(String.format("Here are the final details on your event: \n Guests: %d \n Food: %s \n Beverages: %s \n Entertainment: %s \n Cost: $%s", event.getGuests(), event.getFood(), event.getDrink(), event.getEntertainment(), event.getPrice()));
                System.out.println("Would you like to generate another quote? y/n");
                String userContinue = bufferedReader.readLine();
                if (userContinue.equals("y")){
                    event = new Event();
                } else {
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

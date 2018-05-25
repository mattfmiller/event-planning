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
                String userGuests = bufferedReader.readLine();
                event.setGuests(Integer.parseInt(userGuests));
                System.out.println("How many guests will be attending the party?");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

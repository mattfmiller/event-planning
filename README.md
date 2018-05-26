# Event Planner

#### Allows users to choose various options about a potential party to generate a quote.

#### By _**Matt Miller**_

## Description

This application will walk the user through a set of question in order to obtain details about a potential party. Once all the information has been collected, the application will return a quote from a fictitious event planning service.

#### Specifications

| Specification | Input | Output |
| --- | --- | --- |
| Program will set the number of guests for the event | Input: "150" | Output: "Guests: 150" |
| Program will set food option for the event | Input: "Dinner" | Output: "Food: Dinner" |
| Program will set drink option for the event | Input: "Full Bar" | Output: "Beverages: Full Bar" |
| Program will set entertainment for the event | Input: "DJ" | Output: "Entertainment: DJ" |
| Program will allow user to enter a coupon code of "1" to receive a $50 discount | Input: "1" | Output: "Coupon Code: 1" |
| Program will allow user to enter a coupon code of "2" if the event has 150+ guests, dinner, and drinks to receive free DJ service | Input: "2" | Output: "Coupon Code: 2" |
| Program will set price of event based on input options | Input: "150", "Dinner", "Full Bar", "none", "2" | Output: "Guests: 150, Food: Dinner, Beverages: Full Bar, Entertainment: DJ, Price: $6850" |
| Program will check that user input for guests is valid | Input: "-34" | Output: "That is not a valid entry. Please re-enter the number of guests." |

## Setup/Installation Requirements

* View program by cloning repository from https://github.com/mattfmiller/event-planning
* Open project in IDE such as IntelliJ IDEA
* Run App.java to compile the program and interact with it through the console.

## Known Bugs

* Program does not inform user when they do not meet conditions of coupon.

## Support and contact details

For support, contact: matt.f.miller@live.com

## Technologies Used

* Java

### License

This software is licensed under the GPL license.

Copyright © 2018 **Matt Miller**

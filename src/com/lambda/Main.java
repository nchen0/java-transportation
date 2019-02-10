package com.lambda;

import java.util.ArrayList;

public class Main {
    public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester) {
        for (AbstractVehicle v : vehicles) {
            if (tester.test(v)) {
                System.out.println(v.getName());
            }
        }
    }

    public static void main(String[] args) {
	// Add a horse
        Horse seabiscuit = new Horse("Seabiscuit", 10);
        Horse joe = new Horse("Joe");
        // This way, we can have two different ways above like this, this is what polymorphism is.

        Horse affirmed = new Horse("Affirmed");
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);

        // We can't instantiate an abstract class, but we can create a list of those types.
        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        myList.add(new HorseFromVehicle("Secretariat"));
        myList.add(new HorseFromVehicle("Trigger"));
        myList.add(new HorseFromVehicle("Seattle Slew"));
        myList.add(new HorseFromVehicle("American Pharoah"));
        myList.add(new HorseFromVehicle("Eclipse"));
        myList.add(new Auto("VW", 20));
        myList.add(new Auto("Toyota", 10));
        myList.add(new Auto("Honda", 25));
        // We can do the above, EVEN though arraylists can only have 1 type, because they're all the same type, an abstract class of abstractVehicle

        // List all vehicles with fuel > 5
        // We will do this with what is called a lambda expression. It's complicated to setup, but it's easier afterwards.
        // Lambda expressions in JS are called anonymous functions. Lambda expressions can be sent as parameters.
        // Below, getFuelLevel is essentially tester above.
        printVehicles(myList, v -> v.getFuelLevel() > 5);
        // printVehicles(myList, v -> v.getPath().equals("Grass"));

        System.out.println("*** Sorting ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName())); // This says, v1, v2 are the objects we want to sort, we want to get the name of v1, to the name of v2.
        myList.forEach(v -> System.out.println(v.getName()));

        System.out.println("*** Fuel Level ***");
        myList.sort((v1, v2) -> v1.getFuelLevel() - v2.getFuelLevel()); // When you're doing a sort, this lambda expression HAS to return an integer, so we have to do subtract.
        myList.forEach(v -> System.out.println(v.getFuelLevel()));


        System.out.println("*** Fuel level between 5 and 15 ***");
        printVehicles(myList, v -> (v.getFuelLevel() > 5) && v.getFuelLevel() < 15);

        System.out.println("*** Sort alphabetically ***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printVehicles(myList, v -> (v.getFuelLevel() > 5) && v.getFuelLevel() < 15);
    }

}

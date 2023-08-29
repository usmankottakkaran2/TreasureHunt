package com.aurionpro.test;
import java.util.Scanner;

import java.util.Scanner;

public class TreasureHuntTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Treasure Island!");
        System.out.println("Your mission is to find the treasure.");
        
        System.out.println("Do you want to go left or right?");
        String direction = scanner.nextLine();
        
        if (direction.equalsIgnoreCase("right")) {
            System.out.println("You fall into a hole. Game over!");
        } else if (direction.equalsIgnoreCase("left")) {
            System.out.println("Do you want to swim or wait?");
            String action = scanner.nextLine();
            
            if (action.equalsIgnoreCase("swim")) {
                System.out.println("You were attacked by trout. Game over!");
            } else if (action.equalsIgnoreCase("wait")) {
                System.out.println("Which door do you choose? blue, red, and yellow.");
                String door = scanner.nextLine();
                
                switch (door.toLowerCase()) {
                    case "red":
                        System.out.println("Burned by fire. Game over!");
                        break;
                    case "blue":
                        System.out.println("Eaten by beasts. Game over!");
                        break;
                    case "yellow":
                        System.out.println("You found the treasure and won");
                        break;
                    default:
                        System.out.println("Game over!");
                        break;
                }
            } else {
                System.out.println("Game over!");
            }
        } else {
            System.out.println("Game over!");
        }
        
        scanner.close();
    }
}

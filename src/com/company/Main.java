//DAVID SEMCHISHIN
//LAB 2


package com.company;

public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] highTemperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitations = {95, 60, 25, 5, 0, 75, 90};


        System.out.println("Cities with a temperature of 32 or less and precipitation of 50% or more (meaning snow is likely) are: ");

        for (int i = 0; i < daysOfWeek.length; i++) {
            if (highTemperatures[i] <= 32 && precipitations[i] >= 50) {

                System.out.println(daysOfWeek[i]);
            }

        }

        }
    }


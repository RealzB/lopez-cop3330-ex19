package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight ");
        String uiweight = sc.nextLine();
        if (!uiweight.matches("[0-999]")) {
            System.out.println("Invalid number. Restart.");
            System.exit(1);
        }
        else if (uiweight.matches("[0-999]"));

        float weight = Float.valueOf(uiweight);
        System.out.println("Enter your height ");
        String uiheight = sc.nextLine();
        float height = Float.valueOf(uiheight);
        float bmi = (weight / (height * height)) * 703;
        System.out.println(bmi);

        if (18.5 <= bmi && bmi <= 25) {
            System.out.println("Your BMI is "+ bmi + ". You are within the ideal weight range.");
            String uiftemp = sc.nextLine();
            float ftemp = Float.valueOf(uiftemp);
            float ctemp = (ftemp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + ctemp);

        }



    }
}
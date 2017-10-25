package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstTipX1;
        int firstTipY1;
        int firstTipX2;
        int firstTipY2;
        int firstTipX3;
        int firstTipY3;

        int secondTipX1;
        int secondTipY1;
        int secondTipX2;
        int secondTipY2;
        int secondTipX3;
        int secondTipY3;


        System.out.println("Enter the x coordinate for the first tip");
        Scanner scanner = new Scanner(System.in);
        String readLine = scanner.nextLine();


        while(true) {
            try {
                firstTipX1 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the first tip");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the first tip");
            }
        }

        System.out.println("Your username is " + username);

        Triunghi triangle1 = new Triunghi(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        Triunghi triangle2 = new Triunghi(new Point(1, 1), new Point(2, 2), new Point(3, 3));





    }



}

package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the first tip in the format x,y");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Your username is " + username);

        Triunghi triangle1 = new Triunghi(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        Triunghi triangle2 = new Triunghi(new Point(1, 1), new Point(2, 2), new Point(3, 3));





    }



}

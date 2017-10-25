package com.company;

import java.awt.*;
import java.util.ArrayList;
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


        System.out.println("Enter the x coordinate for the first tip of the first triangle");
        Scanner scanner = new Scanner(System.in);
        String readLine;


        while(true) {
            readLine = scanner.nextLine();
            try {
                firstTipX1 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the first tip of the first triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the first tip of the first triangle");
            }
        }

        System.out.println("Enter the y coordinate for the first tip of the first triangle");
        while(true) {

            readLine = scanner.nextLine();
            try {
                firstTipY1 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the first tip of the first triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the first tip of the first triangle");
            }
        }

        System.out.println("Enter the x coordinate for the second tip of the first triangle");
        while(true) {

            readLine = scanner.nextLine();
            try {
                firstTipX2 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the second tip of the first triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the second tip of the first triangle");
            }
        }

        System.out.println("Enter the y coordinate for the second tip of the first triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                firstTipY2 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the second tip of the first triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the second tip of the first triangle");
            }
        }

        System.out.println("Enter the x coordinate for the third tip of the first triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                firstTipX3 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the third tip of the first triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the third tip of the first triangle");
            }
        }

        System.out.println("Enter the y coordinate for the third tip of the first triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                firstTipY3 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the third tip of the first triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the third tip of the first triangle");
            }
        }

        System.out.println("Enter the x coordinate for the first tip of the second triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                secondTipX1 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the first tip of the second triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the first tip of the second triangle");
            }
        }

        System.out.println("Enter the y coordinate for the first tip of the second triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                secondTipY1 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the first tip of the second triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the first tip of the second triangle");
            }
        }

        System.out.println("Enter the x coordinate for the second tip of the second triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                secondTipX2 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the second tip of the second triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the second tip of the second triangle");
            }
        }

        System.out.println("Enter the y coordinate for the second tip of the second triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                secondTipY2 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the second tip of the second triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the second tip of the second triangle");
            }
        }

        System.out.println("Enter the x coordinate for the third tip of the second triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                secondTipX3 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the third tip of the second triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the x coordinate for the third tip of the second triangle");
            }
        }

        System.out.println("Enter the y coordinate for the third tip of the second triangle");
        while(true) {
            readLine = scanner.nextLine();
            try {
                secondTipY3 = Integer.parseInt(readLine);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the third tip of the second triangle");
            } catch(NullPointerException e) {
                System.out.println("Wrong input, enter a number.");
                System.out.println("Enter the y coordinate for the third tip of the second triangle");
            }
        }








        Triunghi triangle1 = new Triunghi(new Point(firstTipX1, firstTipY1), new Point(firstTipX2, firstTipY2), new Point(firstTipX3, firstTipY3));
        Triunghi triangle2 = new Triunghi(new Point(secondTipX1, secondTipY1), new Point(secondTipX2, secondTipY2), new Point(secondTipX3, secondTipY3));


        ArrayList<Point> intersectionList = calculateIntersectionList(triangle1, triangle2);

        if(intersectionList.isEmpty()){
            System.out.println("No intersections between the chosen triangles.");
        }
        else{
            System.out.println("Intersection found. Intersection consists of the points: ");
            for (Point point : intersectionList){
               System.out.println(point.toString());
            }
        }



    }


    public static ArrayList<Point> calculateIntersectionList(Triunghi firstTriangle, Triunghi secondTriangle){

        ArrayList<Point> intersectionList = new ArrayList<Point>();

        for (Point point : firstTriangle.puncte) {
            if (secondTriangle.puncte.contains(point)) {
                intersectionList.add(point);
            }
        }


        return intersectionList;
    }



}

package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {

    public static final double pi = 3.14;

    public static void main(String[] args) {
        System.out.print("Enter a radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        getArea(radius);
        if (radius < 0) {
            System.out.println("The radius cannot be negative.");
            System.out.println();
        }

    }

    public static String getArea(double r)
    {
        double area = pi * r * r;
        return "The area of a circle of radius " + r + " units is " + area + " square units.";
    }
}

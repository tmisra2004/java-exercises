package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {

    public static final double pi = 3.14;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double r = input.nextDouble();
        double area = pi * r * r;
        while (r < 0)
        {
            System.out.println("Radius cannot be negative.");
            System.out.println();
            System.out.print("Enter a radius: ");
            r = input.nextDouble();

        }

        System.out.println("The area of a circle of radius " + r + " units is " + area + " square units.");


    }




}

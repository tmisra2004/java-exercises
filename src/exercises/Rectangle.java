package exercises;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args)
    {
        System.out.print("What is the length of the rectangle? ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.print("What is the width of the rectangle? ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is " + area + " square units.");

    }
}

package exercises;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args)
    {
        System.out.print("How many miles have you driven? ");
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();
        System.out.print("How many gallons of gas have you used? ");
        double gas_gallons = input.nextDouble();
        double gasmileage = miles / gas_gallons;
        System.out.println("Your gas mileage is " + gasmileage + " mpg.");
    }


}

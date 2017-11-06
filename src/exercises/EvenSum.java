package exercises;
import java.util.ArrayList;

public class EvenSum {

    public static void main(String[] args)
    {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(0);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(10);

        int sum = 0;

        for (int i = 0; i < ints.size(); i++)
        {
            if (ints.get(i) % 2 == 0)
            {
                sum += ints.get(i);
            }
        }

        System.out.print("The sum of the even integers in the array list is " + sum + ".");
    }
}

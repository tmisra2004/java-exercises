package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {

    public static void main(String[] args)
    {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID Number:  ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");
        System.out.println();

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}

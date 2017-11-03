package exercises;
import java.util.Scanner;


public class Alice {

    public static void main(String[] args)

    {
        System.out.println();
        String alicequote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("We are searching the following block of text:");
        System.out.println();
        System.out.println(alicequote);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("What term would you like to search for? ");
        String searchterm = input.next();
        int alicequotelength = alicequote.length();
        int searchtermlength = searchterm.length();
        boolean match = false;
        for (int i = 0; i <= alicequotelength - searchtermlength; i++)
        {
            if (alicequote.regionMatches(i, searchterm, 0, searchtermlength))
            {
                match = true;
                System.out.println("The specified search term, '" + alicequote.substring(i, i + searchtermlength) + "' was found.");
                break;
            }
        }

        if (!match)
        {
            System.out.println("The specified search term was not found.");
        }
    }
}

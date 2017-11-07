package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args)
    {
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> charactercount = new HashMap<>();
        for (char character : charactersInString)
        {
            if (!charactercount.containsKey(character))
            {
                charactercount.put(character, 1);
            }

            else
            {
                charactercount.put(character, charactercount.get(character) + 1);
            }

        }

        for (Map.Entry<Character, Integer> chars : charactercount.entrySet())
        {
            System.out.println(chars.getKey() + ": " + chars.getValue());
        }

    }
}

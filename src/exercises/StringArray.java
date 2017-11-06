package exercises;

import java.util.ArrayList;

public class StringArray {

    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        words.add("category");
        words.add("shave");
        words.add("spy");
        words.add("cane");
        words.add("confine");
        words.add("sweat");
        words.add("stamp");
        words.add("crosswalk");
        words.add("beneficiary");
        words.add("fashionable");
        words.add("exchange");
        words.add("utter");
        words.add("professor");
        words.add("gap");
        words.add("incredible");
        words.add("path");
        words.add("demand");
        words.add("reactor");
        words.add("coffee");
        words.add("observation");
        words.add("cover");
        words.add("penetrate");
        words.add("protect");
        words.add("mutter");
        words.add("damage");
        words.add("inn");
        words.add("video");
        words.add("facility");
        words.add("person");
        words.add("means");
        words.add("demonstrate");
        words.add("green");
        words.add("opposition");
        words.add("addicted");
        words.add("qualified");
        words.add("flexible");
        words.add("slot");
        words.add("village");
        words.add("pair");
        words.add("exaggerate");
        words.add("residence");
        words.add("recover");
        words.add("entitlement");
        words.add("engineer");
        words.add("tendency");
        words.add("officer");
        words.add("orange");
        words.add("delivery");
        words.add("back");
        words.add("ambiguity");

        int i = 0;
        while (i < words.size())
        {
            if (words.get(i).length() == 5)
            {
                System.out.println(words.get(i));

            }

            i++;
        }
    }
}

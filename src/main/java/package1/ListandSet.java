package package1;

import java.util.*;

public class ListandSet {

    public static void main (String[] args) {

        String name = "Balaji";

        Set<Character> set = new LinkedHashSet<Character>();

        List<Character> list = new LinkedList<Character>();

        char[] charArray = name.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (!set.add(charArray[i])) {
                list.add(charArray[i]); // duplicate found
            }
        }

        }






}

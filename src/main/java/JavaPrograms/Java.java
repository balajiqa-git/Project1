package JavaPrograms;

import java.util.*;

public class Java {

    public static void main(String[] args)
    {

        String name = " baalaji";

        char[] charArray = name.toCharArray();

        int count=0;

        String rev="";

        Set<Character> set1 =new LinkedHashSet<Character>();

        List<Character> list1 = new LinkedList<Character>();

        for (int i=1; i<charArray.length; i++){

            if(charArray[i]=='a'){

                count++;

            }

            if(charArray[i]=='i'){

                count++;

            }

            if(!set1.add(charArray[i]))
            {
                if (!list1.contains(charArray[i]))
                {
                    list1.add(charArray[i]);
                }

            }

        }

        System.out.println(count + "count of vowals");

        System.out.println(list1 + " duplicate");

        System.out.println(set1 + " " + "unique");


        for (int i=charArray.length-1;i>=0;i--)
        {
            rev=rev+charArray[i];

        }

        if(rev.equals(name)){

            System.out.println(name+" is a palindrome.");
        }
        else{
            System.out.println(name+" is not a palindrome.");
        }


    }
}

package JavaPrograms;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Sentances {

    public static void main(String[] args) {

        String sentence = "Automation Testing madam";

        String[] split = sentence.split(" ");


        for (int i=0;i<split.length;i++){

            String word = split[i];

            String rev= "";

             for (int j=word.length()-1;j>=0;j--){

                 rev=rev + word.charAt(j);

             }

             if (!rev.equals(word)){

                 System.out.print(word + " ");

             }







        }


    }

}
package JavaPrograms;

import java.util.Scanner;

public class CountofAEIOU {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        String word = "";

        for (;;){
           System.out.println("Enter an Input");
           word = sc.nextLine();

           word = word.toLowerCase();



      if (word.equalsIgnoreCase("exit")) {

          System.out.println("Program input stop");
          break;
      }


        int a =0;
        int e =0;
        int i =0;
        int o =0;
        int u =0;

        for (int j=0;j<word.length();j++){



            if (word.charAt(j)=='a'){
                a++;
            }
            if (word.charAt(j)=='e'){
                e++;
            }

            if (word.charAt(j)=='i'){
                i++;
            }

            if (word.charAt(j)=='o'){
                o++;

            }
            if (word.charAt(j)=='u'){
                u++;

            }

        }

        if (a>0){

            System.out.println("A" + a);
        }



    }}}
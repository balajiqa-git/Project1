package JavaPrograms;

public class deloitte3 {

    public static void main(String[] args) {

        String Name = "Balaji";

        int age = 2;

        String c = "";
        String b = "";

        char[] nameChar = Name.toCharArray();

        for (int i = nameChar.length-1 ; i >= nameChar.length-age; i--){

          //  String temp = String.valueOf(nameChar[i]);
            c=c+nameChar[i];

        }

       // System.out.println(c);

        for (int j =0 ; j < nameChar.length-age ; j++){
            b=b+nameChar[j];

        }
        System.out.println(c+b);

    }

}

package JavaPrograms;

public class Palinrome {

    public static void main(String[] args) {

      String name ="Madam";

      String Rev= "";

      for(int i=name.length()-1;i>=0;i--){

          Rev =Rev +  name.charAt(i);

      }

      if(Rev.equalsIgnoreCase(name)){

          System.out.println(name+" is a palindrome.");
      }
    }
}

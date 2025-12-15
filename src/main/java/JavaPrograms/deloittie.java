package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class deloittie {


    public static void main(String[] args) {

        List<String> products = Arrays.asList("pen", "mobile", "Hairpin", "Apple");
        List<Integer> counts = Arrays.asList(10, 2, 20, 4);

        int order=5;

        for (int i = 0; i < products.size() ; i++) {

            if (counts.get(i) <order) {

                System.out.println(products.get(i));
            }

        }

    }

}


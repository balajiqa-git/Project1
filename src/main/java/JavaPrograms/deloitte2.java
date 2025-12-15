package JavaPrograms;

public class deloitte2 {

    public static void main(String[] args) {

        String[] product = {"pen", "mobile", "Hairpin", "Apple"};

        int order=5;

    Integer[] count = {10, 2, 20, 4};

    for(int i = 0;i<product.length;i++){

        if (count[i]<order) {

            System.out.println(product[i] +count[i]);

        }

    }

}

}




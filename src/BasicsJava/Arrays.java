package BasicsJava;

public class Arrays {

    public static void main (String [] args){

        // Used to store multiple values in a single variable

        String[] cars = {"Camaro", "Porsche", "Tesla"};

        System.out.println(cars[1]);

        String[] brands = new String[4];

        brands[0] = "Apple";
        brands[1] = "Versace";
        brands[2] = "Asus";
        brands[3] = "Sony";

        for(int i=0; i<brands.length; i++){
            System.out.println(brands[i]);
        }

    }

}

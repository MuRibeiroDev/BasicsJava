package BasicsJava;
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        // ArrayList = A resizable array.
        // Elements can be added and removed after compilation phase
        // Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        // add a string to the ArrayList
        food.add("pizza");
        food.add("hamburger");
        food.add("hot-dog");


        // set element of index 0 to sushi
        food.set(0, "sushi");

        // remove element of index 2
        food.remove(2);

        // remove all elements from array
        food.clear();

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}

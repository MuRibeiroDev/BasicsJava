package BasicsJava;

import java.util.ArrayList;

public class TwoDimensionalArrayList {

    public static void main(String[] args) {
        // 2D ArrayList = A dynamic list of lists
        // You can change the size of these lists during runtime


        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // print the first element of the first list (pasta)
        System.out.println(groceryList.get(0).get(0));




    }

}


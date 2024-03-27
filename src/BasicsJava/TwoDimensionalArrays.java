package BasicsJava;

public class TwoDimensionalArrays {

    public static void main(String[] args) {


        //  String[][] = {
        //                   {"Jetta", "Golf", "Passat"},
        //                   {"Virtus", "Nivus", "Tiguan"},
        //                   {"Gol", "Amarok", "Polo"};
        //                   }


        // or

        String[][] cars = new String[3][3];

        cars[0][0] = "Jetta";
        cars[0][1] = "Golf";
        cars[0][2] = "Passat";
        cars[1][0] = "Virtus";
        cars[1][1] = "Nivus";
        cars[1][2] = "Tiguan";
        cars[2][0] = "Gol";
        cars[2][1] = "Amarok";
        cars[2][2] = "Polo";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }
        }


    }

}

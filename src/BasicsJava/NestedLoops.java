package BasicsJava;

public class NestedLoops {

    public static void main(String []args) {

        // Loop inside the body of another loop

        int weeks = 3;
        int days = 4;

        for (int i = 1; i <= weeks; ++i){
            System.out.println("Week: " + i);

            for (int j = 1; j <= days; ++j){
                System.out.println("Day: " + j);
            }
        }

    }

}

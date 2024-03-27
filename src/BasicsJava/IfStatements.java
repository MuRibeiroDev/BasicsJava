package BasicsJava;

import java.util.Random;

public class IfStatements {

    public static void main(String[] args) {

        Random random = new Random();

        int age = random.nextInt(100);

        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 60) {
            System.out.println("Booomer!!");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a baby");
        }

    }


}

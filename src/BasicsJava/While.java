package BasicsJava;

import java.util.Scanner;

public class While {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("What is your name?");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+ name);

    }


}

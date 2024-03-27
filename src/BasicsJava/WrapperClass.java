package BasicsJava;
import java.util.ArrayList;

public class WrapperClass {

    public static void main(String [] args){

//        Wrapper classes in Java are used to encapsulate primitive types into objects.
//         They provide a way to represent primitive types as objects,
//         allowing you to use them in contexts where objects are expected.

//                Boolean - para o tipo primitivo boolean.
//                Byte - para o tipo primitivo byte.
//                Short - para o tipo primitivo short.
//                Integer - para o tipo primitivo int.
//                Long - para o tipo primitivo long.
//                Float - para o tipo primitivo float.
//                Double - para o tipo primitivo double.
//                Character - para o tipo primitivo char.


        // Creating an ArrayList to store Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding primitive integers to the ArrayList using autoboxing
        numbers.add(10);    // Converted to Integer object automatically
        numbers.add(20);    // Converted to Integer object automatically
        numbers.add(30);    // Converted to Integer object automatically

        // Accessing elements from the ArrayList
        System.out.println("Elements in ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }



    }



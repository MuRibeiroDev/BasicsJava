package BasicsJava;

public class Methods {
    public static void main(String[] args) {

        String name = "Murillo";

        // Call the method name and set parameters that the function requires
        hello(name, 18);
    }

    // the function hello have two parameters, and print hello + name + age
    static void hello(String name, int age){
        System.out.println("Hello "+ name + " " + age);
    }

}

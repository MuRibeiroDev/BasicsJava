package BasicsJava;

public class Methods {
    public static void main(String[] args) {

        String name = "Murillo";

        // Call the method name and set parameters that the function requires
        hello(name, 18);

        int z = add(5, 6);

        System.out.println(z);
        // System.out.println(add(5, 6););
    }

    // the function hello have two parameters, and print hello + name + age
    static void hello(String name, int age) {
        System.out.println("Hello " + name + " " + age);
    }

    static int add(int x, int y) {

        int z = x + y;

        // return x + y

        return z;

    }

}

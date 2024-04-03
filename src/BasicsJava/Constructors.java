package BasicsJava;

public class Constructors {


    String name;
    int age;
    double weight;

    Constructors(int age, String name, double weight) {

        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }

}


/** public class Main() {

  public static void main(String[] args) {

        I need set the parameters of constructor
        Constructors constructors = new Constructors();

        Constructors constructors = new Constructors(18, "Murillo", 65.0);

  }
}

 */
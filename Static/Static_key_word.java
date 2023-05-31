package Static;

public class Static_key_word {
  public static void main(String[] args) {

    /* when we declear our methods,variables or class as static it means the methods,variables
      or class belongs to the object itself not the instances of the variable.
   */

    // You cannot have non-static  methods,variables or class in a static method

    // instances of the class, as we can see our static variable name is not available
    test testClass =new test("Black",17);

    // as stated above our static variable name is now an object of the class,
    // so we can set and get the value of name without the setter & getter objects or methods
    // Note static variable values stays desame, they acts as constant  values
    // .
    test.name = "Prince";


    System.out.println("Class Names => " + test.name);

    // Making ues of a static methods
    test.printStatic();

    // Making ues of a non-static methods
    // we need to instantiate the class first
    test t =new test("Light brown",17);
    // then we access the non-static method
    t.print_Non_static();
  }
}

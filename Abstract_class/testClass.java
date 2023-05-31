package Abstract_class;

public class testClass extends testAbstractClass{
    // we cannot extend more than one abstract class

    @Override
    public void printName(String name) {
        System.out.println(name);
    }

    // then we create another constructor here to extend the constructor in our abstract class

    public testClass(String email) {
        super(email);
    }
}

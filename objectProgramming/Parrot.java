package objectProgramming;

public class Parrot extends Brid{
    public Parrot(String name, String colour, int legs, boolean hasTail, int wings, int children) {
        super(name, colour, legs, hasTail, wings, children);
    }

    public Parrot(String name, String colour, int legs, int wings, int children) {
        super(name, colour, legs, wings, children);
    }

    public String fly(){
        System.out.println(getName() +" is flying today");
        return "";
    }
}

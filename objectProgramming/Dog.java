package objectProgramming;

public class Dog extends Animal{
    private String Bread;
    public Dog(String name, String colour, int legs, boolean hasTail, String bread) {
        super(name, colour, legs, hasTail);
        Bread = bread;
    }

    @Override
    public void dead(String name){
        System.out.println(name + " is not dead");
    }
    public String getBread() {
        return Bread;
    }

    public void setBread(String bread) {
        Bread = bread;
    }
}

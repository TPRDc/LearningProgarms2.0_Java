package objectProgramming;

public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog("Bull Dog","Brown",4,true,"Nigeria");
        System.out.println(dog.getName());

        Parrot parrot =new Parrot("Praise","black",2,true,2,5);
        System.out.println("Name - "+parrot.getName());
        System.out.println("Colour - "+parrot.getColour());
        System.out.println("Legs - "+parrot.getLegs());
        System.out.println("Tail - "+parrot.isHasTail());
        System.out.println("Wings - "+parrot.getWings());
        System.out.println("Children - "+parrot.getChildren());
        System.out.println(parrot.fly());

       Brid brid =new Brid("Wille","pink",2,2,4);
       brid.chicks();
       brid.chicks(brid.getName(),brid.getChildren());
    }
}

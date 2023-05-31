package Composition;

public class Main {
    public static void main(String[] args) {

        // first way/method of instantiation
        Engine engine =new Engine("TRXP 2019",6000);
        Car toyota =new Car("Toyota Corolla",4,"Black",engine);
        System.out.println("Name - "+toyota.getName());
        System.out.println("Doors - "+toyota.getDoors());
        System.out.println("Colour - "+toyota.getColor());
        System.out.println("Model - "+toyota.getEngine().getModel());
        System.out.println("Rpm - "+toyota.getEngine().getRpm());

        System.out.println();

        // second way/method of instantiation
        Car mercedes =new Car("Mercedes AMG",2,"Silver",new Engine("Renault",8000));
        System.out.println("Name - "+mercedes.getName());
        System.out.println("Doors - "+mercedes.getDoors());
        System.out.println("Colour - "+mercedes.getColor());
        System.out.println("Model - "+mercedes.getEngine().getModel());
        System.out.println("Rpm - "+mercedes.getEngine().getRpm());
    }
}

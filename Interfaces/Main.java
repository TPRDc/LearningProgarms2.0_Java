package Interfaces;

public class Main {
    public static void main(String[] args) {
        // method of instantiation
        // we are assign a class into an interface
        CarInterface carInterface =new ElectricCar("Benz's");
        carInterface.start();
        carInterface.move(40);

        CarInterface carInterface1 =new fuelClass("Toyota");
        carInterface1.start();
        carInterface1.move(20);

        testInterface testInterface =new fuelClass("Audi");
        testInterface.printName("Prince");

    }

}

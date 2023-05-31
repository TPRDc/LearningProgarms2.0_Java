package Interfaces;

public class ElectricCar implements CarInterface {
    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ctrl + i to complete instantiation and generate the methods below
    @Override
    public void start() {
        // some functionality
        System.out.println(this); // printing class address
        System.out.println("Electricity Flow Started...");

    }

    @Override
    public void move(int speed) {
        // some functionality
        System.out.println(this.getName()+" is moving at "+speed+" mph");
    }
}

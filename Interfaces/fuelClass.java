package Interfaces;

public class fuelClass implements CarInterface, testInterface{
    private String name;

    public fuelClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in cylinder caused the engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()+" is moving at "+speed+" mph");
    }

    // implementing more than one interface's

    @Override
    public void printName(String name) {
        System.out.println("Hello "+name);
    }
}

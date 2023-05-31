package Interfaces;

public interface CarInterface {

    // Interface have no-body
    // interface can not be private
    // By using interface we don't give the functionality of the method here
    // Rather we are making a contract, which can be use in multiply classes

    void start();
    void move(int speed);
}

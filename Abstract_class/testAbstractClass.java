package Abstract_class;

public abstract class testAbstractClass{

    // An Abstract method
    // Abstract methods have no-body
    // Abstract methods can not be private
    // By using abstract method we don't give the functionality of the method here
    // Rather we are making a contract, which can be use in multiply classes
    // we can also have public non-abstract methods inside our abstract class

    public abstract void printName(String name);

    // we can also have a flied and a constructor
    private String email;
    public testAbstractClass(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // why having a non-abstract class in your abstract class
    // we included the boby of the method
    public void printColor(String color){
        System.out.println("Hi the i love "+color+" colour");
    }

}

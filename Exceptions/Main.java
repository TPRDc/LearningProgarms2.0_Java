package Exceptions;

public class  Main{
    public static void main(String[] args) {

        // let's right a division program and try using exception's

        int a=2; int b=0;
        // System.out.println(a/b); now this code will flag an ArithmeticException, so we use the try & catch block
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e){
            e.printStackTrace(); // useful for debugger, give's you the name of the exception and where it occurred
            System.out.println("Cannot divide by zero");
        }
        /*
        we are to put the specific exception we want the program to catch in the catch block, so we run the code first get the type of
        exception message we need which is been displayed too us then come back to our code and pass in that exception
        as a parameter to the catch object, or we can just pass in Exception for all exception's.
        */

    }
}

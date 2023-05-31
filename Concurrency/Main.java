// Concurrency: carry out multiple task's at simultaneously

package Concurrency;

public class Main {
    public static void main(String[] args) {
        // first we create a thread
        // the thread object receives a parameter "Runnable()" which is an interface
        Thread thread =new Thread(new Runnable() {

            // branch thread
            @Override
            public void run() {
                 // System.out.println("Hello Thread"); // used in testing our thread

                // we wil use this for loop to print the value of i and sleep our thread
                for (int i=0; i<5; i++){
                    System.out.println("Printing "+i+" in a branch thread");

                    /*
                    command to sleep our thread
                    this instantiation required a parameter, a number which it will count as milliseconds
                    so 1 second = 1000 millisecond
                    */
                    try {
                        Thread.sleep(1000); // man statement
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        // we initialize the branch thread inside our main thread the object by
        thread.start();

        for (int i=0; i<5; i++){
            System.out.println("Printing "+i+" in a main thread");
            try {
                Thread.sleep(1000); // man statement
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

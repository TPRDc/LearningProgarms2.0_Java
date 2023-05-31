// Singleton Pattern are use to make sure that they are one instance of a class in our entry code

package Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("db_music");
        System.out.println(database.toString());

    }
}

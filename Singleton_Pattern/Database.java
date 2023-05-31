package Singleton_Pattern;

public class Database {
    private String name;

    // Singleton Pattern;
    private static Database instance;
    // creating a constructor for instance
    public static synchronized Database getInstance(String name){
        if (null==instance){
            instance =new Database(name);
            return instance;
        }else
            return instance;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // overriding the toString method

    @Override
    public String toString() {
        String text = "Database class\n" + "Name: "+ this.name;
        return text;
    }
}

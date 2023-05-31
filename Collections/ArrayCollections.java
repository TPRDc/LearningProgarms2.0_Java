package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollections {
    public static void main(String[] args) {
        // 1st method of instantiation
        ArrayList<String> names =new ArrayList<>();

        // 1st method of instantiation
        List<Integer> regNumbers =new ArrayList<>();

        // to add element or items to the list
        regNumbers.add(100);
        regNumbers.add(200);
        regNumbers.add(300);
        names.add("Prince");
        names.add("Princess");
        names.add("Tiko"); // you can add as much element as u which;

        // how to print every item in a list or array list
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i)+" "+regNumbers.get(i));
        }

        // get an item using it index number
        names.get(0);

        // get size of the collection (numeral value)
        names.size();

        // check if it contains a give object & returns a boolean
        regNumbers.contains("Tiko");

        // checks if collection is empty
        regNumbers.isEmpty();

        // change the data of an item by putting its index & new value, return the old data
        names.set(2,"Richard");

        // clear out the collection
        names.clear();

        // remove or delete an item in the collection by putting its index or object;
        regNumbers.remove(0);

        // Passing a Class as the data type for ouy array list
        ArrayList<Students> student =new ArrayList<>();
        // adding item to our array list
        student.add(new Students("Prince Obeten",215));
        student.add(new Students("okoi ubi",216));
        // getting student name
        student.get(0).getName();

        // for each loops
        for(Students s: student){
            System.out.println(s.getName());
        }
    }
}

package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        // method of instantiation
        Map<String, String> emailList =new HashMap<>();
        // add values into collection
        emailList.put("Miss Obia","obiausani78@gmail.com");// Miss Obia is the key or object key of this data & the email adders is the value
        emailList.put("Pastor Philip", "philipobeten2@gmail.com");
        emailList.put("Okoi","okoi@gmail.com");
        emailList.put("Reye","reye@gmial.com");

        // to get an item, input in the object key
        emailList.get("Miss Obia"); // we should get the email adders assign to this name

        // get size of the collection (numeral value)
        emailList.size();

        // remove or delete an item in the collection by putting its index or object;
        emailList.remove("Pastor Philip");

        // change the data/value of an item by putting its object key, old value & new value
        emailList.replace("okoi","okoi@gmail.com","isu@gmail.com");

        // checks if collection contains a key returns a boolean
        emailList.containsKey("Reye");

        // checks if collection contains a value returns a boolean
        emailList.containsValue("reye@gmail.com");

        // clear out the collection
        emailList.clear();

        // checks if collection is empty
        emailList.isEmpty();
    }
}

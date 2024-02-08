package day8.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        /*Maps are unordered
        Sometimes you must use wrapper classes, for example when working with Collection objects
        To loop through a collection, use the hasNext() and next() methods of the Iterator:
         */

        // Creating a HashMap
        Map<String, Integer> dictionary = new HashMap<>();

        // Adding key-value pairs
        dictionary.put("apple", 10);
        dictionary.put("banana", 5);
        dictionary.put("orange", 8);

        /* get(Object key): Returns the value associated with the specified key,
         or null if the map contains no mapping for the key.*/
        System.out.println(dictionary.get("apple"));

       /* containsKey(Object key): Returns true if the map contains
       a mapping for the specified key, otherwise returns false. */

        boolean exists = dictionary.containsKey("apple");
        System.out.println(exists);

        /*
         * containsValue(Object value): Returns true if the map contains one or more keys mapped to the specified value.
         * */
        boolean existsVal = dictionary.containsValue(10);

        //Iterating over entries:
        for (String key : dictionary.keySet()){
            System.out.println(key);
            Integer value = dictionary.get(key);
            System.out.println(value);
        }
    }


}

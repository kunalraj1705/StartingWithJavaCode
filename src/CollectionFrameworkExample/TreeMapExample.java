package CollectionFrameworkExample;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String arg[])
    {
        TreeMap<Integer, String> students = new TreeMap<>(); // LINE A
        students.put(3, "Bhardwaj");
        students.put(1, "Kunal");
        students.put(2, "Raj");

        //Automatically sorts in ascending key order
        System.out.println("Map sorted in ascending key order : " + students);

        // poll.FirstEntry returns the first entry in the  map and then it removes from map
        System.out.println("First entry in the map is : " + students.pollFirstEntry());

        System.out.println("Map after using pollFirstEntry : " + students);

        //Returns true if map contains the key otherwise false
        System.out.println("Map contains key 1 : " + students.containsKey(1));

        //Returns true if map contains the value otherwise false
        System.out.println("Map contains value Raj : " + students.containsValue("Raj"));

        students.remove(3);
        System.out.print("Map after removing 3 : ");
        System.out.println(students);
    }
}

package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<Integer> marks = new ArrayList<>(0);

        //Add method in ArrayList
        marks.add(100);
        marks.add(110);
        marks.add(125);

        //Display the stored values in the ArrayList
        System.out.print("List : ");
        displayList(marks);
        System.out.println();

        //Adding value at a specific index
        marks.add(1, 90);

        //Display the stored values in the ArrayList
        System.out.print("List after adding 90 at index 1 : ");
        displayList(marks);

        System.out.println();

        //Retrieving specified index values
        System.out.println("Value at index 2 : " + marks.get(2));

        //Searching the index of an object in the list
        System.out.println("Index of 2 in the List : " + marks.indexOf(2));

        //Removing a value at given index
        System.out.println("Removing value at index 3 : " + marks.remove(3));

        //Display the stored values in the ArrayList
        System.out.print("List after removing value at index 3 : ");
        displayList(marks);

        //Set element at index 0
        System.out.println("\nReplace value at index 0 : " + marks.set(0, 40) + " with 40");

        System.out.print("List after setting value at index 0 : ");
        displayList(marks);
    }

    //Display the stored values in the ArrayList
    static void displayList(List<Integer> marks){
        for(Integer mark : marks){
            System.out.print( mark + " ");
        }
    }
}

package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kunal");
        arrayList.add("Raj");
        arrayList.add("Bhardwaj");

        System.out.println("ArrayList Size : " + arrayList.size());

        System.out.println("Array List : " + arrayList);

        System.out.println("Deleting Bhardwaj from array list : " + arrayList.remove("Bhardwaj"));

        System.out.println("Is Kunal present in arraylist : " + arrayList.contains("Kunal"));

        System.out.println("Get first element : " + arrayList.get(0));

        System.out.print("Iterating Through List : ");
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}

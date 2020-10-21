package CollectionFrameworkExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        //Initialize set
        Set<Integer> set = new HashSet<>(0);

        //Add values to the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        //Display set elements
        System.out.println("Set elements : " + set);

        //Iterating through set
        Iterator it = set.iterator();

        System.out.print("Iterate through set Using Iterator : ");
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("Size of Set is : " + set.size());
        System.out.println("Set contains element 30 : " + set.contains(30));
        System.out.println("Is set empty : " + set.isEmpty());
    }
}

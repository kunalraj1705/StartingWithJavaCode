package CollectionFrameworkExample;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args){
        SortedSet<Integer> sortedSet = new TreeSet<>();

        //Adding elements to the TreeSet
        sortedSet.add(10);
        sortedSet.add(30);
        sortedSet.add(20);

        //SortedSet Elements
        System.out.println("Sorted Set Elements : " + sortedSet);

        //Iterating through sorted set
        System.out.print("Iterating through sorted set : ");
        Iterator it = sortedSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.println("Smallest element : " + sortedSet.first());
        System.out.println("Highest element : " + sortedSet.last());
        System.out.println("Elements lesser than 20 : " + sortedSet.headSet(20));
        System.out.println("Elements Higher than or equals to 20 : " + sortedSet.tailSet(20));
        System.out.println("Range elements between 20-40 : " + sortedSet.subSet(20, 40));
    }
}

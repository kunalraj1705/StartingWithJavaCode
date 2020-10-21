package CollectionFrameworkExample;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args){
        NavigableSet<Float> navigableSet = new TreeSet<>();
        navigableSet.add(10.0f);
        navigableSet.add(10.1f);
        navigableSet.add(10.2f);
        navigableSet.add(10.3f);
        navigableSet.add(10.4f);
        navigableSet.add(10.5f);

        System.out.println("Navigable Set Elements : " + navigableSet);

        System.out.print("Iterating through Navigable set : ");
        Iterator it = navigableSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //Returns least element which is higher or equals to the given element
        System.out.println("Element Higher or equals to 10f : " + navigableSet.ceiling(10f));

        //Returns revers order view of elements present in the set
        System.out.println("Descending order of Set : " + navigableSet.descendingSet());

        //Returns highest element which is less than or equals to the given element
        System.out.println("Element Lower or equal to 10.4f : " + navigableSet.floor(10.4f));

        //Returns view of the portion of the set where elements are lesser than 10.4f
        System.out.println("Headset elements : " + navigableSet.headSet(10.4f, false));

        //Returns element higher than the given element
        System.out.println("Higher element : " + navigableSet.higher(10.2f));

        //Returns element lower than the given element
        System.out.println("Lower element : "+navigableSet.lower(10.5f));

        System.out.println("Deletes lowest element : "+navigableSet.pollFirst());
        System.out.println("Deletes highest element : "+navigableSet.pollLast());
    }
}

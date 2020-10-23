package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ThreadSafeCollectionsExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>(0);
        Collection<String> synchronizedNames = Collections.synchronizedCollection(names);
        AddNames addNames = new AddNames(synchronizedNames);
        DisplayNames displayNames = new DisplayNames(synchronizedNames);
        addNames.start();
        displayNames.start();
    }
}
class AddNames extends Thread{
    final Collection<String> c;
    public AddNames(Collection<String> c){
        this.c = c;
    }
    public void run(){
        for (int i = 1; i <= 5; i++){
            synchronized (c){
                c.add("N" + i);
            }
            try {
                Thread.sleep(200);
            }catch (Exception ignored){

            }
        }
    }
}

class DisplayNames extends Thread{
    final Collection<String> c;
    public DisplayNames(Collection<String> c){
        this.c = c;
    }
    public void run(){
        for(int i = 1; i <=5; i++) {
            synchronized(c) // LINE D
            {
                Iterator<String> iterator = c.iterator(); // Must be in the synchronized block
                while (iterator.hasNext())
                {
                    System.out.print(iterator.next() + "~");
                }
            }
            System.out.println();

            try { Thread.sleep(200); } catch(Exception ignored) { }
        }
    }
}

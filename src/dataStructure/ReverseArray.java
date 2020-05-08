package dataStructure;

import java.util.*;

public class ReverseArray {

    public static ArrayList<Integer> revArray(ArrayList<Integer> a){
        Collections.reverse(a);
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();
        int flag = 1;
        System.out.println("Please enter the values to be inserted in the array");
        while (flag == 1){
            a.add(sc.nextInt());
            System.out.println("Do You Want To Continue \n1 : Yes\n0 : No");
            flag = sc.nextInt();
            if(flag != 1){
                break;
            }
        }
        System.out.println("Reversed Array is : "+revArray(a));
    }
}

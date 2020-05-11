package StringProb;
import java.util.Scanner;

public class StringIntroduction {
    public void basicString(){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.print("Total Length : ");
        System.out.println(A.length()+B.length());
        System.out.print("Lexicographically Comparison : ");
        System.out.println(A.compareTo(B)>0?"Yes":"No");//This compares the substring lexicographically
        System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1, A.length()))
                +" "+
                B.substring(0,1).toUpperCase().concat(B.substring(1,B.length())));
    }
}

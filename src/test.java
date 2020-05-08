import java.util.Scanner;

public class test {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] subStrArray = new String[s.length() -k +1];
        int len = s.length();
        int sublen = 0;
        int l = 0;
        while(sublen + k <= len){
            subStrArray[l] = s.substring(sublen, sublen + k);
            sublen = sublen + 1;
            l = l + 1;
        }
        //Sorting the arrayList
        String temp = "";
        for (int i = 0; i < subStrArray.length; i++){
            for (int j = i + 1; j < subStrArray.length; j++){
                if (subStrArray[i].compareTo(subStrArray[j]) > 0){
                    temp = subStrArray[i];
                    subStrArray[i] = subStrArray[j];
                    subStrArray[j] = temp;
                }
            }
        }
        smallest = subStrArray[0];
        largest = subStrArray[subStrArray.length -1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
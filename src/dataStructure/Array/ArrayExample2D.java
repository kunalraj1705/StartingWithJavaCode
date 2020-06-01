package dataStructure.Array;

//Calculate the hourglass sum for every hourglass in Array, then print the maximum hourglass sum

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExample2D {
    //2-D Array
    int[][] arr = new int[6][6];

    //To store the sum of each hourglass
    ArrayList<Integer> hourGlassSum = new ArrayList<>();

    int max = -999;

    private static final Scanner scanner = new Scanner(System.in);

    //Scanning the 2D Array
    public void scanArray(){
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
    }

    //Calculating the sum of hourglass
    public int sum(){

        for (int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
                int sum1 = 0,sum2 = 0, sum3 = 0;
                sum1 = sum1 + arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum2 = sum2 + arr[i+1][j+1];
                sum3 = sum3 + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];


                //Adding the hourglass value to the Arraylist
                hourGlassSum.add(sum1+sum2+sum3);

                //directly finding the max value
                if(max < sum1+sum2+sum3){
                    max = sum1+sum2+sum3;
                }
            }

        }
        //sorting the arraylist
        Collections.sort(hourGlassSum, Collections.reverseOrder());
//        return hourGlassSum.get(0);
        return max;
    }

    public static void main(String args[]){
        ArrayExample2D ae = new ArrayExample2D();
        ae.scanArray();
        System.out.println("Highest sum is : "+ae.sum());
    }
}

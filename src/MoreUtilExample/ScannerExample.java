package MoreUtilExample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        String string = "Hello World !";
        Scanner scanner = new Scanner(string);

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Reading and Writing a file");
        //File Reader and Writer
        try{
            System.out.println("Writing into file.....");
            FileWriter fw = new FileWriter("File.txt");
            fw.write("25 34 21 45 27 18 49 43");
            fw.close();
            System.out.println("Writing Completed......");

            System.out.println("Reading file.......");
            FileReader fileReader = new FileReader("FIle.txt");
            Scanner scanner1 = new Scanner(fileReader);
            double totalSum = 0;
            int count = 0;

            while (scanner1.hasNext()){
                System.out.println("Reading.....");
                totalSum += scanner1.nextInt();
                count++;
            }
            System.out.println("Reading Complete.....");
            System.out.println("Total Token Sum   : " + totalSum);
            System.out.println("Total Token Count : " + count);


        }catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }

    }
}

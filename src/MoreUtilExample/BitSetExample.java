package MoreUtilExample;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args){
        BitSet bitSet = new BitSet();
        bitSet.set(2);
        bitSet.set(3);
        bitSet.set(1);

        System.out.println("BitSet : " + bitSet);

        BitSet bitSet1 = new BitSet();
        bitSet1.set(1,5);
        System.out.println("BitSet1 : " + bitSet1);

        bitSet.and(bitSet1);
        System.out.println("BitSet AND BitSet1 : " + bitSet);

        bitSet.or(bitSet1);
        System.out.println("BitSet OR BitSet1 : " + bitSet);

        bitSet.flip(2);
        System.out.println("BitSet Flip : " + bitSet);

    }
}

package Codility.BinaryGap;

import java.util.*;

class Solution {
    public int solution(int N) {
        int gapNumber = 0;

        String binaryString = Integer.toBinaryString(N);
        String binaryArray [] = binaryString.split("1");

        LinkedList <String> binaryList = new LinkedList<>(Arrays.asList(binaryArray));

        binaryList.removeAll(Arrays.asList("", null));

        if(binaryString.startsWith("0")){
            binaryList.removeFirst();
        }
        if(binaryString.endsWith("0")){
            binaryList.removeLast();
        }

        for(String binary : binaryList){
            if(gapNumber < binary.length()){
                gapNumber = binary.length();
            }
        }

        return gapNumber;

    }
}
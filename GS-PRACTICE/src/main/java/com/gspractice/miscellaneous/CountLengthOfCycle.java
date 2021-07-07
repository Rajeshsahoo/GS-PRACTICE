package com.gspractice.miscellaneous;

public class CountLengthOfCycle {

	public static void main(String[] args) {
        System.out.println(countLengthofcycle(new int[]{1,0},0));
        System.out.println(countLengthofcycle(new int[]{1,2,0},0));
        System.out.println(countLengthofcycle(new int[]{1,2,1,0},0));
    }

    private static int countLengthofcycle(int[] arr, int start) {
        int count  = 1;
        while(arr[start]>0){
            if(start>= arr.length)return -1;
            int val  = arr[start];
            if(val<0){
                return -1;
            }
            arr[start]*=-1;
            start = val;
            count++;
        }
        return count;


    }

}

package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3 {

    public static void main(String[] args) {
        int[] arr= {100,200,50,40,60};
       int num= max(arr);
        System.out.println(max(arr));




    }








    public static int max(int[] arr){
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        int min= arr[0];
        return max;

    }












































}

package day19_ForLoop;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum = 0;
        // 5 ...
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                //sum = sum +i;
                sum += i; // sum = sum +i
            }
            System.out.println(sum);


        } else {
            System.out.println("Invalid number");
        }


    }


}

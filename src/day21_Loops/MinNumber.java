package day21_Loops;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 999999;
        for (int i = 1; i <= 5; i++){
            System.out.println("Enter a nubmer");
            int userInput = scan.nextInt();

            if (min>userInput){
                min = userInput;
            }
        }
        System.out.println("Minimum number is: "+ min);

























































































    }












































































}

package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMehods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary= scan.nextDouble();

        scan.nextLine(); //use this to take out the enters that are left in the scanner. so that we can use the nextLine

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+ fullName);





















































    }












































































}

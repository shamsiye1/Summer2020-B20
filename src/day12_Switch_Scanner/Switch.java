package day12_Switch_Scanner;

public class Switch {
    public static void main(String[] args) {
        int a = 6;
        switch (a) {
            case 5:
                System.out.println("Five");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("Invalid Case");

        }
        System.out.println("=======================================");

        int day = 12;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Number");
        }


    }


}

package day33_LocalDataTime;

import java.time.LocalDate;

public class BirthDay {
    public static void main(String[] args) {

        HappyBirthDay(1999,5,13);



    }


    public static LocalDate HappyBirthDay(int year, int month, int day){
        LocalDate birthDay= LocalDate.of(year, month, day);
        LocalDate today= LocalDate.now();

        int month2= today.getMonthValue();
        int day2= today.getDayOfMonth();
        if(month2== month && day2==day ){
            System.out.println("Today is your birthday");
            System.out.println("   \n \t \t \t    * * * * * * * * * * *  * * * * *");
            System.out.println("   \t \t \t \t    * * * * * * * * * * * * * * * * ");
            System.out.println("  \t \t  \t \t* *                             * * ");
            System.out.println(" \t \t \t \t* *      Happy BirthDay To You    * * ");
            System.out.println("  \t \t  \t \t* *                             * * ");
            System.out.println("   \t \t \t \t *   * * * * * * * * * * * * * * * * ");
            System.out.println("   \t \t \t \t    * * * * * * * * * * * * * * * *");


        }else{
            System.out.println("Today is not your birthday yet");
        }



        return today;

    }





























}

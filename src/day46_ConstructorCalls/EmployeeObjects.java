package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee("Cristina");
        System.out.println(employee1);
        System.out.println("=======================");
        Employee employee2= new Employee("aliya","SDET");
        System.out.println(employee2);

        System.out.println("===============================================");

        Employee employee3= new Employee("nazakat","QA",125887);
        System.out.println(employee3);

        System.out.println("=============================");

        Employee employee4= new Employee("zilnaz","DEVOP",785544,5000000);
        System.out.println(employee4);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();

        ArrayList<Integer> list2= new ArrayList<>(list1);
        ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(1,2,3,4,5));

       // System.out.println(list2);











    }
}

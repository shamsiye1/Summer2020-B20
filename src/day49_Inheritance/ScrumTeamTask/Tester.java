package day49_Inheritance.ScrumTeamTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, double salary, int id, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);

    }
    public void smokingTesting(){
        System.out.println(name+" is running smoke Test, while drinking coffee!");
    }
    public void  creatingTicket(){
        System.out.println(name+" is creating ticket on JIRA");
    }

}

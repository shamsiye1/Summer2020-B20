package day42_static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

   static String schoolName = "Cybertek School";
    static String favoriteTeacher = "Nadir";

    public void setInfo( String name, int age, int groupNumber, char gender){
         this.name= name;
         this.age= age;
         this.gender= gender;
         this.groupNumber= groupNumber;

    }

    public String toString(){  // instance method

        return "School name: "+schoolName+ "\nStudent name: "+name;
        //                      static variable                instance variable
    }





}

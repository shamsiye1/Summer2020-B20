package day29_CustomMethods;

public class eligibilityToVote {


    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }







    public static void main(String[] args) {
        vote("jon",28,true,"biden");
        vote("daniel",17,true,"donald");
        eligibleToBuyAlcohol(true, 19);

        System.out.println("===============================");
        calculator(100,'*',200);
    }



    public static void vote(String name, int age, boolean citizen, String presidentName){
        boolean eligibleToVote = age>=18 && citizen==true;
        if(eligibleToVote){
            System.out.println(name+ " is eligible to vote for "+ presidentName);
        }else{
            System.out.println(name+ " is not eligible to vote");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        switch(operator){
            case '+':
                System.out.println("Addition: "+ (num1+num2));
                break;
            case'-':
                System.out.println("Subtraction: "+ (num1-num2));
                break;
            case'/':
                System.out.println("Division "+ (num1/num2));
                break;
            case'*':
                System.out.println("Multiplication: " +(num1*num2));
                break;
            case'%':
                System.out.println("Remainder: "+ (num1%num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }


    }




























































}

// Objecy Oriented Programming
// Object - Properties and Behaviours

// To create an object you start by creating a class(blueprint)
// The JVM creates the object from the byte-code produced by the class

public class Demo
{
    public static void main(String a[])
    {
        // TERNARY OPERATOR - ?:

        int n = 4;
        int result = 0;

        // if(n % 2 == 0)
        //     result == 10;
        // else
        //     result = 20;

        //    - if the condition BEFORE ? is true execute the code AFTER THE ? else excute the code AFTER :
        

        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);


        // SWITCH STATEMENT
        // 1. Without break statement - newer version)

        String day = "Monday";

        switch(day)
        {
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");

        }

        // Switch as an expression
        String result2 = "";
        switch(day)
        {
            case "Saturday", "Sunday" -> result2 = "6am";
            case "Monday" -> result2 = "8am";
            default -> result2 = "7am";

        }

        //OR  
        result2 = switch(day)
        {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";

        }; //NB!! DO NOT FORGET SEMI-COLON SINCE THE SWITCH STATEMENT IS A EXPRESSION(VARIABLE)

        //OR - Not using the arrow key 
        result2 = switch(day)
        {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield  "8am";
            default : yield "7am";

        }; 

        
    }
}

// CLASSES AND OBJECTS
// A class has methods(functions)
// A class can also have variables (always before the method but in the class)
class Calculator
{
    //Class VARIABLE
    int a; 
    // public = called anywhere in code
    //int = return type
    //add() = function name (can describe class action)
    public int add()
    {
        System.out.println();
        return 0;
    }
}
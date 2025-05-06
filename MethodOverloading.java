// Write a Java Program to Add the Two Integers and Two Float Numbers. When No Agruments are supplied give
// a default Values to calculate the Sum (Used Method Overloading): 


//                                     ADDITION METHOD:

public class MethodOverloading {
   int addition()
   {
      return (10+10);
   }
   int addition (int x, int y)
   {
      return(x+y);
   }
   float addition(float a, float b)
   {
      return (a+b);
   }
   public static void main (String args[])
   {
      MethodOverloading a = new MethodOverloading();
      System.out.println("By Using Default Values Sum is:" +a.addition(10,20));
      System.out.println("Sum of two Integers Values (10 & 20) is:" +a.addition(10,20));
      System.out.println("sum of Two Float Values (10.5 & 20.5) is:" +a.addition(10.5f,20.5f));
   }
}


//                                 SUBTRACTION METHOD:

// public class MethodOverloading{
// int subtraction()
// {
//    return (10-10);
// }
// int subtraction(int x, int y)
// {
//    return(x-y);
// }
// float subtraction(float a, float b)
// {
//    return(a-b);
// }
// public static void main(String args[])
// {
//    MethodOverloading a = new MethodOverloading();
//    System.out.println("By Using default values the sum is=" +a.subtraction(100,70));
//    System.out.println("The Sum of Integer values is=" +a.subtraction(100,70));
//    System.out.println("The sum of Float Values is=" +a.subtraction(100.5f,70.5f));
// }
// }



// -Summary of Program Flow:
// >The program demonstrates method overloading by defining three methods with the same name but 
// different parameter lists.
// >It creates an instance of the MethodOverloading class.
// >It calls each overloaded method and prints the results.

// -Key Concepts:
// >Method Overloading: This is a feature in Java that allows a class to have more than one method with 
// the same name, as long as their parameter lists are different (either in number, type, or both).
// >Different Method Signatures: The methods have different signatures, allowing the Java compiler to 
// distinguish between them based on the number and type of parameters passed.
// >Type Casting for Floats: The 10.5f and 20.5f are explicitly specified as floats using the f suffix 
// to match the addition(float a, float b) method.

// -In summary, the program effectively demonstrates method overloading by defining multiple addition 
// methods with different parameters and showing how each one can be called appropriately based on the 
// provided arguments.
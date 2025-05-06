// Write a Program to Demonstrate a Division by Zero Exception: 


public class Divisionbyzerodemo 
{
   public static void main (String args[])   
   {
      int a = 5;
      int b = 0;
      try{
         System.out.println(a/b);
      }
      catch(ArithmeticException e)
      {
         System.out.println("Division By Zero Is Not Possiable");
      }
   }
}


// How the Code Works:(Explaniation)

// 1) The main method starts execution.
// 2)Variables a and b are initialized to 5 and 0, respectively.
// 3)The code enters the try block and attempts to execute System.out.println(a/b);.
// 4)Since b is 0, dividing a by b throws an ArithmeticException.
// The catch block catches the exception and executes its code, printing 
// "Division By Zero Is Not Possible" to the console.